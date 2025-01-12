package com.example.entity;


import lombok.*;

import javax.persistence.*;
@Table(name = "EnglishUser", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "userName")
})
@Entity
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;

}
