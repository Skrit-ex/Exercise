package com.example.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookDto {

    @Pattern(regexp = "(\\b[а-яА-Яa-zA-Z]+\\b)" , message = "The nameBook isn't correct, try again")
    private String nameBook;

    @Pattern(regexp = "(\\b[а-яА-Яa-zA-Z]+\\b)" , message = "The nameAuthor isn't correct, try again")
    private String nameAuthor;

    @Pattern(regexp = "([А-ЯA-Z][^.!?]*)" , message = "Check your description")
    private String description;

    private Long UserId;
}
