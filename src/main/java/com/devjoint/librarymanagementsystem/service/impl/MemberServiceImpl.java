package com.devjoint.librarymanagementsystem.service.impl;

import com.devjoint.librarymanagementsystem.dto.request.MemberRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.MemberResponseDto;
import com.devjoint.librarymanagementsystem.entity.Member;
import com.devjoint.librarymanagementsystem.mapper.MemberMapper;
import com.devjoint.librarymanagementsystem.repository.MemberRepository;
import com.devjoint.librarymanagementsystem.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    @Override
    public MemberResponseDto createMember(MemberRequestDto requestDto) {

        Member member = memberMapper.toEntity(requestDto);

        Member savedMember = memberRepository.save(member);

        return memberMapper.toResponse(savedMember);
    }

    @Override
    public MemberResponseDto getMemberById(Long id) {

        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        return memberMapper.toResponse(member);
    }

    @Override
    public Page<MemberResponseDto> getAllMembers(
            int page,
            int size,
            String sortBy,
            String sortDirection) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }

    @Override
    public MemberResponseDto updateMember(Long id, MemberRequestDto requestDto) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }

    @Override
    public void deleteMember(Long id) {

        throw new UnsupportedOperationException(
                "This method will be implemented in Checkpoint 3."
        );
    }
}