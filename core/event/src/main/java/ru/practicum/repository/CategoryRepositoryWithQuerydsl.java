package ru.practicum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.model.Category;

import java.util.Optional;

public interface CategoryRepositoryWithQuerydsl extends JpaRepository<Category, Long> {
    Optional<Category> findCategoriesByNameContainingIgnoreCase(String name);
}
