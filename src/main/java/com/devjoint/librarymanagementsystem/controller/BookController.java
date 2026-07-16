package com.devjoint.librarymanagementsystem.controller;

import com.devjoint.librarymanagementsystem.dto.request.BookRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.BookResponseDto;
import com.devjoint.librarymanagementsystem.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponseDto createBook(
            @Valid @RequestBody BookRequestDto requestDto) {

        return bookService.createBook(requestDto);
    }

    @GetMapping("/{id}")
    public BookResponseDto getBookById(
            @PathVariable Long id) {

        return bookService.getBookById(id);
    }

}