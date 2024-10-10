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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String userName;
    private String email;
    private String password;

    public User(String user, String userName, String email, String password) {
        this.user = user;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}
