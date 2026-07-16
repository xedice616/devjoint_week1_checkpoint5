package com.devjoint.librarymanagementsystem.controller;

import com.devjoint.librarymanagementsystem.dto.request.LoanRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.LoanResponseDto;
import com.devjoint.librarymanagementsystem.service.LoanService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LoanResponseDto createLoan(
            @Valid @RequestBody LoanRequestDto requestDto) {

        return loanService.createLoan(requestDto);
    }

    @GetMapping("/{id}")
    public LoanResponseDto getLoanById(
            @PathVariable Long id) {

        return loanService.getLoanById(id);
    }

    @GetMapping
    public Page<LoanResponseDto> getAllLoans(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        return loanService.getAllLoans(page, size, sortBy, sortDirection);
    }

    @PutMapping("/{id}")
    public LoanResponseDto updateLoan(
            @PathVariable Long id,
            @Valid @RequestBody LoanRequestDto requestDto) {

        return loanService.updateLoan(id, requestDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLoan(
            @PathVariable Long id) {

        loanService.deleteLoan(id);
    }
}