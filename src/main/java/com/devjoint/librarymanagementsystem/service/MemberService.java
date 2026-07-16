package com.devjoint.librarymanagementsystem.service;

import com.devjoint.librarymanagementsystem.dto.request.MemberRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.MemberResponseDto;
import org.springframework.data.domain.Page;

public interface MemberService {

    MemberResponseDto createMember(MemberRequestDto requestDto);

    MemberResponseDto getMemberById(Long id);

    Page<MemberResponseDto> getAllMembers(
            int page,
            int size,
            String sortBy,
            String sortDirection
    );

    MemberResponseDto updateMember(Long id, MemberRequestDto requestDto);

    void deleteMember(Long id);
}