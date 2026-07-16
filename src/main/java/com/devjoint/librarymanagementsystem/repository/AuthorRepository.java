package com.devjoint.librarymanagementsystem.repository;

import com.devjoint.librarymanagementsystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}