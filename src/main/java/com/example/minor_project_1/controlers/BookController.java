package com.example.minor_project_1.controlers;

import com.example.minor_project_1.dtos.CreateBookRequest;
import com.example.minor_project_1.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/createbook")
    public void createBook(@RequestBody @Valid CreateBookRequest request){
        bookService.createBook(request.toBook());
    }

}
