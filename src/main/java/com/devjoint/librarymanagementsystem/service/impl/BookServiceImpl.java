package com.devjoint.librarymanagementsystem.service.impl;

import com.devjoint.librarymanagementsystem.dto.request.BookRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.BookResponseDto;
import com.devjoint.librarymanagementsystem.entity.Author;
import com.devjoint.librarymanagementsystem.entity.Book;
import com.devjoint.librarymanagementsystem.mapper.BookMapper;
import com.devjoint.librarymanagementsystem.repository.AuthorRepository;
import com.devjoint.librarymanagementsystem.repository.BookRepository;
import com.devjoint.librarymanagementsystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final BookMapper bookMapper;

    @Override
    public BookResponseDto createBook(BookRequestDto requestDto) {

        Author author = authorRepository.findById(requestDto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Book book = bookMapper.toEntity(requestDto);

        book.setAuthor(author);

        Book savedBook = bookRepository.save(book);

        return bookMapper.toResponse(savedBook);
    }

    @Override
    public BookResponseDto getBookById(Long id) {

        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        return bookMapper.toResponse(book);
    }

    @Override
    public Page<BookResponseDto> getAllBooks(
            int page,
            int size,
            String sortBy,
            String sortDirection) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }

    @Override
    public BookResponseDto updateBook(Long id, BookRequestDto requestDto) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }

    @Override
    public void deleteBook(Long id) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }
}