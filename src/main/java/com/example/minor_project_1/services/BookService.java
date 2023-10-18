package com.example.minor_project_1.services;

import com.example.minor_project_1.domain.Author;
import com.example.minor_project_1.domain.Book;
import com.example.minor_project_1.repositries.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorService authorService;

    public void createBook(Book book){
        //bookRepository.save(book);
        Author author = book.getMyAuthor();
        Author author1 = authorService.getOrCreateAuthor(author);
        //System.out.println(author1.getEmail()+"--------------");
        book.setMyAuthor(author1);
       // System.out.println(book.getMyAuthor().getEmail());
        bookRepository.save(book);

    }
}
