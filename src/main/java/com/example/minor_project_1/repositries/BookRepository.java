package com.example.minor_project_1.repositries;

import com.example.minor_project_1.domain.Book;
import com.example.minor_project_1.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

   List<Book> findByName(String name);
   List<Book> findByGenre(Genre genre);
   @Query("select b from Book b, Author a where b.myAuthor.id = a.id and a.name = ?1")
   List<Book> findByAuthorName(String authorName);

}
