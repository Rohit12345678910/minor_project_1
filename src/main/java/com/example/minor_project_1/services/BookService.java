package com.example.minor_project_1.services;

import com.example.minor_project_1.domain.Author;
import com.example.minor_project_1.domain.Book;
import com.example.minor_project_1.domain.Genre;
import com.example.minor_project_1.repositries.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    public List<Book> find(String key, String value){
        switch (key){
            case "id":
                Optional<Book>  book = bookRepository.findById(Integer.parseInt(value));
                if(book.isPresent()){
                    return Arrays.asList(book.get());
                }
                else {
                    return new ArrayList<>();
                }
            case "name":
                return bookRepository.findByName(value);
            case "genre":
                return bookRepository.findByGenre(Genre.valueOf(value));
            case "authorName":
                return bookRepository.findByAuthorName(value);
            default:
                throw new RuntimeException("Invalid key "+key);
        }
    }
}
