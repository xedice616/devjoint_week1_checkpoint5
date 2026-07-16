package com.devjoint.librarymanagementsystem.repository;

import com.devjoint.librarymanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}