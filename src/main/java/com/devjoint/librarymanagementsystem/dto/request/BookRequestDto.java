package com.devjoint.librarymanagementsystem.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequestDto {

    @NotBlank(message = "Book title cannot be empty")
    private String title;

    @NotBlank(message = "ISBN cannot be empty")
    private String isbn;

    @NotNull(message = "Publication year is required")
    @Min(value = 1000, message = "Publication year is invalid")
    private Integer publicationYear;

    @NotNull(message = "Author id is required")
    private Long authorId;
}