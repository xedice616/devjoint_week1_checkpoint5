package com.devjoint.librarymanagementsystem.controller;

import com.devjoint.librarymanagementsystem.dto.request.AuthorRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.AuthorResponseDto;
import com.devjoint.librarymanagementsystem.service.AuthorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorResponseDto createAuthor(
            @Valid @RequestBody AuthorRequestDto requestDto) {

        return authorService.createAuthor(requestDto);
    }

    @GetMapping("/{id}")
    public AuthorResponseDto getAuthorById(
            @PathVariable Long id) {

        return authorService.getAuthorById(id);
    }

    @GetMapping
    public Page<AuthorResponseDto> getAllAuthors(

            @RequestParam(defaultValue = "0") int page,

            @RequestParam(defaultValue = "5") int size,

            @RequestParam(defaultValue = "id") String sortBy,

            @RequestParam(defaultValue = "asc") String sortDirection) {

        return authorService.getAllAuthors(
                page,
                size,
                sortBy,
                sortDirection
        );
    }

    @PutMapping("/{id}")
    public AuthorResponseDto updateAuthor(
            @PathVariable Long id,
            @Valid @RequestBody AuthorRequestDto requestDto) {

        return authorService.updateAuthor(id, requestDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuthor(
            @PathVariable Long id) {

        authorService.deleteAuthor(id);
    }
}