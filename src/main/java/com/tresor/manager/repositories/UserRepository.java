package com.tresor.manager.repositories;

import com.tresor.manager.models.Task;
import com.tresor.manager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<Task, Long> {
    Optional<User> findByEmail(String email);
    java.util.List<User> findByNameContainingIgnoreCase(String name);
    boolean existsByEmail(String email);
}
