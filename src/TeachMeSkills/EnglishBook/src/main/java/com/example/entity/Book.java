package com.example.entity;

import jakarta.persistence.*;
import lombok.*;



@Table(name = "englishBook", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "nameBook")
})
@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameBook;
    private String nameAuthor;
    private String lastNameAuthor;
    private String description;

    public Book(String nameBook, String nameAuthor, String lastNameAuthor, String description) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.lastNameAuthor = lastNameAuthor;
        this.description = description;
    }
}
