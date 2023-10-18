package com.example.minor_project_1.services;

import com.example.minor_project_1.domain.Author;
import com.example.minor_project_1.repositries.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author getOrCreateAuthor(Author author){
        Author retrivedAuthor = authorRepository.findByEmail(author.getEmail());
//        System.out.println(retrivedAuthor.getEmail()+"--------------");
        if(retrivedAuthor == null){
            return authorRepository.save(author);
        }
        else {
            return retrivedAuthor;
        }
    }
}
