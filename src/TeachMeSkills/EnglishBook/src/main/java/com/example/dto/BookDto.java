package com.example.dto;

import javax.validation.constraints.Pattern;

public class BookDto {

    @Pattern(regexp = "(\\b[а-яА-Яa-zA-Z]+\\b)" , message = "The nameBook isn't correct, try again")
    private String nameBook;

    @Pattern(regexp = "(\\b[а-яА-Яa-zA-Z]+\\b)" , message = "The nameAuthor isn't correct, try again")
    private String nameAuthor;

    @Pattern(regexp = "(\\b[а-яА-Яa-zA-Z]+\\b)" , message = "The lastNameAuthor isn't correct, try again")
    private String lastNameAuthor;

    @Pattern(regexp = "([А-ЯA-Z][^.!?]*)" , message = "Check your description")
    private String description;

    private Long UserId;
}
