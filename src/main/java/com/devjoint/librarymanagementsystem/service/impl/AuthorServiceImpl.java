package com.devjoint.librarymanagementsystem.service.impl;

import com.devjoint.librarymanagementsystem.dto.request.AuthorRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.AuthorResponseDto;
import com.devjoint.librarymanagementsystem.service.AuthorService;
import com.devjoint.librarymanagementsystem.mapper.AuthorMapper;
import com.devjoint.librarymanagementsystem.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public AuthorResponseDto createAuthor(AuthorRequestDto requestDto) {
        return null;
    }

    @Override
    public AuthorResponseDto getAuthorById(Long id) {
        return null;
    }

    @Override
    public Page<AuthorResponseDto> getAllAuthors(
            int page,
            int size,
            String sortBy,
            String sortDirection) {
        return null;
    }

    @Override
    public AuthorResponseDto updateAuthor(Long id, AuthorRequestDto requestDto) {
        return null;
    }

    @Override
    public void deleteAuthor(Long id) {

    }
}