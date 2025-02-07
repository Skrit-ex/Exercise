package com.example.entity;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "bookDescription", uniqueConstraints = {
        @UniqueConstraint (columnNames = "id")
})

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FullBookDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "full_description", length = 1500)
    private String fullDescription;

    public FullBookDescription(String name, String fullDescription) {
        this.name = name;
        this.fullDescription = fullDescription;
    }
}
