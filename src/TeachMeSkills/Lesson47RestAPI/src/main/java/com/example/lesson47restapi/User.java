package com.example.lesson47restapi;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class User {

    private String name;
    private String username;
    private String password;
}
