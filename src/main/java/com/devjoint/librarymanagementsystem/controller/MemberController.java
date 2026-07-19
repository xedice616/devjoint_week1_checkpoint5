package com.devjoint.librarymanagementsystem.controller;

import com.devjoint.librarymanagementsystem.dto.request.MemberRequestDto;
import com.devjoint.librarymanagementsystem.dto.response.MemberResponseDto;
import com.devjoint.librarymanagementsystem.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MemberResponseDto createMember(
            @Valid @RequestBody MemberRequestDto requestDto) {

        return memberService.createMember(requestDto);
    }

    @GetMapping("/{id}")
    public MemberResponseDto getMemberById(
            @PathVariable Long id) {

        return memberService.getMemberById(id);
    }

    @GetMapping
    public Page<MemberResponseDto> getAllMembers(

            @RequestParam(defaultValue = "0") int page,

            @RequestParam(defaultValue = "5") int size,

            @RequestParam(defaultValue = "id") String sortBy,

            @RequestParam(defaultValue = "asc") String sortDirection) {

        return memberService.getAllMembers(
                page,
                size,
                sortBy,
                sortDirection
        );
    }

    @PutMapping("/{id}")
    public MemberResponseDto updateMember(
            @PathVariable Long id,
            @Valid @RequestBody MemberRequestDto requestDto) {

        return memberService.updateMember(id, requestDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMember(
            @PathVariable Long id) {

        memberService.deleteMember(id);
    }
}