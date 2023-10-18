package com.example.minor_project_1.repositries;

import com.example.minor_project_1.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
