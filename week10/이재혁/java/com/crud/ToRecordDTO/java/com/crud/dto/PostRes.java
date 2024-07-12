package com.crud.dto;

import com.crud.domain.Board;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PostRes {
    private String title;
    private String content;

    @Builder
    public PostRes(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static List<PostRes> toDto(List<Board> boardList) {

        return boardList.stream()
                .map(board -> {
                    return PostRes.builder()
                            .title(board.getTitle())
                            .content(board.getContent())
                            .build();
                }).collect(Collectors.toList());
    }
}
