package com.example.entity;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class SessionUser {

        private long id;

        @Pattern(regexp = "([A-Za-z])*", message = "The firstname contains invalid characters")
        private String name;

        @Pattern(regexp = "\\w*", message = "The username contains invalid characters")
        private String username;

        @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "The email field does not contain a valid email address")
        private String email;

    }
