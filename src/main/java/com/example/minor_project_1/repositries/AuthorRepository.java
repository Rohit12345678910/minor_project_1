package com.example.minor_project_1.repositries;

import com.example.minor_project_1.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findByEmail(String email);
}
