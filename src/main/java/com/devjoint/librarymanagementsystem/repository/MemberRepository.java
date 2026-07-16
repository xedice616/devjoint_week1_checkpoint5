package com.devjoint.librarymanagementsystem.repository;

import com.devjoint.librarymanagementsystem.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}