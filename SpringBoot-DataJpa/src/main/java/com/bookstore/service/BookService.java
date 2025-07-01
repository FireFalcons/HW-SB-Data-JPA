package com.bookstore.service;

import com.bookstore.dto.BookDto;
import com.bookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto bookRequestDto);

    BookDto findById(Long id);

    List<BookDto> findAll();

    BookDto put(Long id, CreateBookRequestDto bookRequestDto);

    void delete(Long id);

}
