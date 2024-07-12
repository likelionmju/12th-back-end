package com.crud.dto;

import com.crud.domain.Board;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public record PostResponse(
        String title,
        String content
) {
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
