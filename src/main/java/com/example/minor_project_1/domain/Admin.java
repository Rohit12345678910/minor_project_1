package com.example.minor_project_1.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private  String email;
    @CreationTimestamp
    private Date createdOn;

    // Asso -
    @OneToMany(mappedBy = "admin")
    private List<Transaction> transactionList;
}
