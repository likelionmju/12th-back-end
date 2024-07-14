package com.crud.dto;

import lombok.Builder;

@Builder
public record PostRequest(
        String title,
        String content
) {
}
