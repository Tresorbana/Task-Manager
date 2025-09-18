package com.tresor.manager.repositories;

import com.tresor.manager.models.Comments;
import com.tresor.manager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Task, Long> {
    List<Comments> findByTask(Task task);
    List<Comments> findByContentContainingIgnoreCase(String keyword);
}
