package com.devjoint.librarymanagementsystem.mapper;

import com.devjoint.librarymanagementsystem.dto.request.BookRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.BookResponseDto;
import com.devjoint.librarymanagementsystem.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "author", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "available", constant = "true")
    Book toEntity(BookRequestDto dto);

    @Mapping(target = "authorFullName",
            expression = "java(book.getAuthor().getFirstName() + \" \" + book.getAuthor().getLastName())")
    BookResponseDto toResponse(Book book);
}