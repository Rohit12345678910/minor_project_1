package com.example.minor_project_1.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @CreationTimestamp
    private Date creationTime;
    @UpdateTimestamp
    private Date updationTime;
    @JoinColumn
    @ManyToOne
    @JsonIgnoreProperties({"bookList"})
    private Author myAuthor;
    @JoinColumn
    @ManyToOne
    private Student student;
    @OneToMany(mappedBy = "book")
    private List<Transaction> transactionList;

}
