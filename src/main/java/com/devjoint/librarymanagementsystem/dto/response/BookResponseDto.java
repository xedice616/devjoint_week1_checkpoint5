package com.devjoint.librarymanagementsystem.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponseDto {

    private Long id;

    private String title;

    private String isbn;

    private Integer publicationYear;

    private Boolean available;

    private String authorFullName;
}