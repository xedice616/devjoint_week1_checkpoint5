package com.devjoint.librarymanagementsystem.service;

import com.devjoint.librarymanagementsystem.dto.request.AuthorRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.AuthorResponseDto;
import org.springframework.data.domain.Page;

public interface AuthorService {

    AuthorResponseDto createAuthor(AuthorRequestDto requestDto);

    AuthorResponseDto getAuthorById(Long id);

    Page<AuthorResponseDto> getAllAuthors(
            int page,
            int size,
            String sortBy,
            String sortDirection
    );

    AuthorResponseDto updateAuthor(Long id, AuthorRequestDto requestDto);

    void deleteAuthor(Long id);
}