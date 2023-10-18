package com.example.minor_project_1.dtos;

import com.example.minor_project_1.domain.Author;
import com.example.minor_project_1.domain.Book;
import com.example.minor_project_1.domain.Genre;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookRequest {
    @NotBlank
    private String name;
    @NotNull
    private Genre genre;
    @NotBlank
    private String authorName;
    @NotBlank
    private String authorEmail;

    public Book toBook(){
        return Book.builder()
                .name(this.name)
                .genre(this.genre)
                .myAuthor(Author.builder()
                        .name(this.authorName)
                        .email(this.authorEmail)
                        .build())
                .build();
    }

}
