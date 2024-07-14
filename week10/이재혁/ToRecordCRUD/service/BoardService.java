package com.crud.service;

import com.crud.domain.Board;
import com.crud.domain.repository.BoardRepository;
import com.crud.dto.PostReq;
import com.crud.dto.PostRequest;
import com.crud.dto.PostRes;
import com.crud.dto.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void createPost(PostRequest postReq) {

        Board board = Board.builder()
                .title(postReq.title())
                .content(postReq.content())
                .build();

        boardRepository.save(board);

    }

    @Transactional
    public List<PostRes> findAllPosts() {
        List<Board> boardList = boardRepository.findAll();

        List<PostRes> postResList = PostRes.toDto(boardList);

        return postResList;
    }

    @Transactional
    public PostResponse findOnePost(Long postId) {

        Optional<Board> optionalBoard = boardRepository.findById(postId);
        Board board = optionalBoard.get();

        PostResponse postRes = PostResponse.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .build();

        return postRes;
    }

    @Transactional
    public void editPost(Long postId, PostRequest postReq) {
        Board board = boardRepository.findById(postId).orElseThrow();

        board.updateBoard(postReq.title());
    }

    @Transactional
    public void deletePost(Long postId) {
        Board board = boardRepository.findById(postId).orElseThrow();

        boardRepository.delete(board);
    }
}
