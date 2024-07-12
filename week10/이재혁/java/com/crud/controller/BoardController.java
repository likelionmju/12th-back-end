package com.crud.controller;

import com.crud.dto.PostReq;
import com.crud.dto.PostRes;
import com.crud.service.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @Operation(summary = "게시물 생성", description = "게시물을 생성합니다.")
    @PostMapping
    public String createPost(@RequestBody PostReq postReq) {

        boardService.createPost(postReq);

        return "ok";
    }


    @GetMapping("/Posts")
    public List<PostRes> getAllPosts() {
        List<PostRes> allPosts = boardService.findAllPosts();

        return allPosts;
    }

    @GetMapping("/{postId}")
    public PostRes findPost(@PathVariable Long postId) {
        PostRes post = boardService.findOnePost(postId);

        return post;
    }

    @PatchMapping("/{postId}")
    public String editPost(@PathVariable Long postId, @RequestBody PostReq postReq) {

        boardService.editPost(postId, postReq);
        return "ok";
    }

    @DeleteMapping("/{postId}")
    public String deletePost(@PathVariable Long postId) {

        boardService.deletePost(postId);
        return "ok";
    }
}
