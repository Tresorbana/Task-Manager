package com.tresor.manager.models;

import jdk.jshell.Snippet;

import javax.xml.stream.events.Comment;
import java.time.LocalDateTime;
import java.util.List;

public record Task(
        Long taskId,
        Long userId,
        String title,
        String description,
        Status status,
        Priority priority,
        Category category,
        List<Comment> comments,
        LocalDateTime dueDate,
        LocalDateTime createdAt
) {
}
