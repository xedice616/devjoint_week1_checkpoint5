package com.devjoint.librarymanagementsystem.repository;

import com.devjoint.librarymanagementsystem.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}