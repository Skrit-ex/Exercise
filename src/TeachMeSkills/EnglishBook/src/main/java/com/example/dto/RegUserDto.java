package com.example.dto;

import javax.validation.constraints.Pattern;

public class RegUserDto {

    @Pattern(regexp = "([A-Za-z])*", message = "The firstname isn't correct, try again")
    private String name;

    @Pattern(regexp = "([A-Za-z])*", message = "The username isn't correct, try again")
    private String username;

    @Pattern(regexp = "(^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$)", message = "The Email isn't correct, try again")
    private String email;

    @Pattern(regexp = "(^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$)" , message = "Password isn't correct, try again")
    private String password;
}