package com.devjoint.librarymanagementsystem.mapper;

import com.devjoint.librarymanagementsystem.dto.request.AuthorRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.AuthorResponseDto;
import com.devjoint.librarymanagementsystem.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "books", ignore = true)
    Author toEntity(AuthorRequestDto dto);

    AuthorResponseDto toResponse(Author author);
}