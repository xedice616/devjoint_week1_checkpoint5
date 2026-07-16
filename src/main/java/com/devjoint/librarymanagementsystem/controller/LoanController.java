package com.devjoint.librarymanagementsystem.controller;

import com.devjoint.librarymanagementsystem.dto.request.LoanRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.LoanResponseDto;
import com.devjoint.librarymanagementsystem.service.LoanService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LoanResponseDto createLoan(@Valid @RequestBody LoanRequestDto requestDto) {
        return loanService.createLoan(requestDto);
    }

    @GetMapping("/{id}")
    public LoanResponseDto getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id);
    }
}