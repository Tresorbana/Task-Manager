package com.tresor.manager.repositories;

import com.tresor.manager.models.Task;
import com.tresor.manager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tresor.manager.models.Status;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
List<Task> findByStatus(Status status);
List<Task> findByCreatedAtAfter(java.time.LocalDateTime date);
List<Task> findByStatusAndPriority(Status status);
List<Task> findByNameContainingIgnoreCase(String keyword);
}
