package com.devjoint.librarymanagementsystem.service;

import com.devjoint.librarymanagementsystem.dto.request.LoanRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.LoanResponseDto;
import org.springframework.data.domain.Page;

public interface LoanService {

    LoanResponseDto createLoan(LoanRequestDto requestDto);

    LoanResponseDto getLoanById(Long id);

    Page<LoanResponseDto> getAllLoans(
            int page,
            int size,
            String sortBy,
            String sortDirection
    );

    LoanResponseDto updateLoan(Long id, LoanRequestDto requestDto);

    void deleteLoan(Long id);
}