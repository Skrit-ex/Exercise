package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;


@Getter
@Setter
public class LoginDto {

    @Pattern(regexp = "(^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$)", message = "The Email isn't correct, try again")
    private String email;

    private String password;
}
