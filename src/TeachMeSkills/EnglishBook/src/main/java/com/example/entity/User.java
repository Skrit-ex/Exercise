package com.example.entity;


import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "EnglishUser")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userName;
    @Column(unique = true)
    private String email;
    private String password;

}
