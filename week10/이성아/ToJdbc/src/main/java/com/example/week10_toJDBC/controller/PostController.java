package com.example.week10_toJDBC.controller;

import com.example.week10_toJDBC.entity.Post;
import com.example.week10_toJDBC.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts") // Controller는 직접 부르기 때문에 경로를 말해줘야함
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts(); // Service에게 넘겨줌
    }

    @PostMapping // return 타입이 없으므로, service에게 시키면 됨
    public void createPost(@RequestBody Post post) {
        this.postService.createPost(post); // postman에서 + > blank collection 하면 New Collection이 뜸 프로젝트 run하고 난 뒤, postman에서 . 3개 누른 후 add requst > GET 에 localhost:8080/api/posts 친 후 Send하면 아무 것도 안뜨는게 정상!
        // 마지막으로 postman에서 get을 post로 바꾸고 아래 바에서 Body로 바꾼 후, 그 아래 raw로 바꾸고 JSON이 뜨면 됨 > 아래에 아래와 같이 작성
        // {
        //     "id" : 3,
        //     "title" : "likelion",
        //     "content" : "ss"
        // }
        // 이후 send를 누르면 완료!
    }
}
