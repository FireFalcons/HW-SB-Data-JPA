package com.bookstore.mapper;

import com.bookstore.dto.BookDto;
import com.bookstore.dto.CreateBookRequestDto;
import com.bookstore.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto bookRequestDto);

    @Mapping(target = "id", ignore = true)
    void updateBookFromDto(CreateBookRequestDto bookRequestDto, @MappingTarget Book book);
}
