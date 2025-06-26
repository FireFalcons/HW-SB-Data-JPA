package com.example.springbootdatajpa.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import java.math.BigDecimal;

@Data
@Entity
@SQLRestriction("deleted <> true")
@SQLDelete(sql = "UPDATE books set deleted = true where id=?")
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private BigDecimal price;
    private String description;
    private String coverImage;

    @Column(nullable = false)
    private boolean deleted = false;
}
