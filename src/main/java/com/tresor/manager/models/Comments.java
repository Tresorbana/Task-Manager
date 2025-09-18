package com.tresor.manager.models;

import java.time.LocalDateTime;

public record Comments(
        Long commentId,
        Long taskId,
        String content,
        LocalDateTime createdAt
) {
}
