package com.tresor.manager.repositories;


import com.tresor.manager.models.Category;
import com.tresor.manager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Task, Long> {
    Optional<Category> findByName(String name);
    java.util.List<Category> findByNameContainingIgnoreCase(String keyword);
    boolean existsByName(String name);
}
