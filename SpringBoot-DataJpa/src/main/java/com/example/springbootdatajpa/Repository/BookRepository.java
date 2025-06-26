package com.example.springbootdatajpa.Repository;

import com.example.springbootdatajpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
