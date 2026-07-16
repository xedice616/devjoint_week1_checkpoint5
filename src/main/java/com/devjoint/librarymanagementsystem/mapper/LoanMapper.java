package com.devjoint.librarymanagementsystem.mapper;

import com.devjoint.librarymanagementsystem.dto.request.LoanRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.LoanResponseDto;
import com.devjoint.librarymanagementsystem.entity.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoanMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "book", ignore = true)
    @Mapping(target = "member", ignore = true)
    @Mapping(target = "borrowDate", ignore = true)
    @Mapping(target = "dueDate", ignore = true)
    @Mapping(target = "returnDate", ignore = true)
    Loan toEntity(LoanRequestDto dto);

    @Mapping(target = "bookTitle", source = "book.title")
    @Mapping(target = "memberFullName",
            expression = "java(loan.getMember().getFirstName() + \" \" + loan.getMember().getLastName())")
    LoanResponseDto toResponse(Loan loan);
}