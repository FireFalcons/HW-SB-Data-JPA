package com.example.springbootdatajpa.mapper;

import com.example.springbootdatajpa.dto.BookDto;
import com.example.springbootdatajpa.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(BookDto bookDto);
}
