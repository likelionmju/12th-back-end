package com.crud.controller;

import com.crud.dto.PostReq;
import com.crud.dto.PostRequest;
import com.crud.dto.PostRes;
import com.crud.dto.PostResponse;
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
    public String createPost(@RequestBody PostRequest postReq) {

        boardService.createPost(postReq);

        return "ok";
    }


    @GetMapping("/Posts")
    public List<PostRes> getAllPosts() {
        List<PostRes> allPosts = boardService.findAllPosts();

        return allPosts;
    }

    @GetMapping("/{postId}")
    public PostResponse findPost(@PathVariable Long postId) {
        PostResponse post = boardService.findOnePost(postId);

        return post;
    }

    @PatchMapping("/{postId}")
    public String editPost(@PathVariable Long postId, @RequestBody PostRequest postRequest) {

        boardService.editPost(postId, postRequest);
        return "ok";
    }

    @DeleteMapping("/{postId}")
    public String deletePost(@PathVariable Long postId) {

        boardService.deletePost(postId);
        return "ok";
    }
}
