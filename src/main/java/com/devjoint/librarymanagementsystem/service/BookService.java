package com.devjoint.librarymanagementsystem.service;
import com.devjoint.librarymanagementsystem.dto.request.BookRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.BookResponseDto;
import org.springframework.data.domain.Page;

public interface BookService {

    BookResponseDto createBook(BookRequestDto requestDto);

    BookResponseDto getBookById(Long id);

    Page<BookResponseDto> getAllBooks(
            int page,
            int size,
            String sortBy,
            String sortDirection);

    BookResponseDto updateBook(Long id, BookRequestDto requestDto);
    void deleteBook(Long id);
}