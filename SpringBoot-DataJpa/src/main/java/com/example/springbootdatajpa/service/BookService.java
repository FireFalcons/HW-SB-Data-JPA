package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto save(BookDto bookDto);

    BookDto findById(Long id);

    List<BookDto> findAll();

    BookDto put(Long id, BookDto bookDto);

    void delete(Long id);

}
