package com.example.minor_project_1.domain;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String txnId;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;
    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updatedOn;
    private int fine;

    //Asso -
    @JoinColumn
    @ManyToOne
    private Book book;
    @JoinColumn
    @ManyToOne
    private Student student;
    @JoinColumn
    @ManyToOne
    private Admin admin;

}
