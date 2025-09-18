package com.tresor.manager.models;

import java.time.LocalDateTime;

public record User(
        Long userId,
        String name,
        String email,
        LocalDateTime createdAt
) {}
