package com.devjoint.librarymanagementsystem.service.impl;

import com.devjoint.librarymanagementsystem.dto.request.LoanRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.LoanResponseDto;
import com.devjoint.librarymanagementsystem.entity.Book;
import com.devjoint.librarymanagementsystem.entity.Loan;
import com.devjoint.librarymanagementsystem.entity.Member;
import com.devjoint.librarymanagementsystem.mapper.LoanMapper;
import com.devjoint.librarymanagementsystem.repository.BookRepository;
import com.devjoint.librarymanagementsystem.repository.LoanRepository;
import com.devjoint.librarymanagementsystem.repository.MemberRepository;
import com.devjoint.librarymanagementsystem.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;
    private final BookRepository bookRepository;
    private final MemberRepository memberRepository;
    private final LoanMapper loanMapper;

    @Override
    public LoanResponseDto createLoan(LoanRequestDto requestDto) {

        Book book = bookRepository.findById(requestDto.getBookId())
                .orElseThrow(() -> new RuntimeException("Book not found"));

        Member member = memberRepository.findById(requestDto.getMemberId())
                .orElseThrow(() -> new RuntimeException("Member not found"));

        Loan loan = loanMapper.toEntity(requestDto);

        loan.setBook(book);
        loan.setMember(member);

        loan.setBorrowDate(LocalDate.now());
        loan.setDueDate(LocalDate.now().plusDays(14));
        loan.setReturnDate(null);

        Loan savedLoan = loanRepository.save(loan);

        return loanMapper.toResponse(savedLoan);
    }

    @Override
    public LoanResponseDto getLoanById(Long id) {

        Loan loan = loanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Loan not found"));

        return loanMapper.toResponse(loan);
    }

    @Override
    public Page<LoanResponseDto> getAllLoans(
            int page,
            int size,
            String sortBy,
            String sortDirection) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }

    @Override
    public LoanResponseDto updateLoan(Long id, LoanRequestDto requestDto) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }

    @Override
    public void deleteLoan(Long id) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }
}