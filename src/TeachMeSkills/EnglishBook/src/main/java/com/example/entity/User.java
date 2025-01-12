package com.example.entity;


import lombok.*;

import javax.persistence.*;
@Table(name = "userTable", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "userName")
})


@Data
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}
