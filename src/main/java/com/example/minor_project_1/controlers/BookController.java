package com.example.minor_project_1.controlers;

import com.example.minor_project_1.domain.Book;
import com.example.minor_project_1.dtos.CreateBookRequest;
import com.example.minor_project_1.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/createbook")
    public void createBook(@RequestBody @Valid CreateBookRequest request){
        bookService.createBook(request.toBook());
    }

    @GetMapping("/book")
    public List<Book> findBook(@RequestParam("key") String key, @RequestParam("value") String value){
        return bookService.find(key, value);
    }


}
