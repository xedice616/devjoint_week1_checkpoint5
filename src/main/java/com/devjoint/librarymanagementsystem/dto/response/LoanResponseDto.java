package com.devjoint.librarymanagementsystem.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanResponseDto {

    private Long id;

    private String bookTitle;

    private String memberFullName;

    private LocalDate borrowDate;

    private LocalDate dueDate;

    private LocalDate returnDate;
}