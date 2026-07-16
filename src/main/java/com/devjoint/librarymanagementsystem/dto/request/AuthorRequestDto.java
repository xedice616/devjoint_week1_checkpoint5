package com.devjoint.librarymanagementsystem.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorRequestDto {

    @NotBlank(message = "First name cannot be empty")
    @Size(max = 50)
    private String firstName;

    @NotBlank(message = "Last name cannot be empty")
    @Size(max = 50)
    private String lastName;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email")
    private String email;
}