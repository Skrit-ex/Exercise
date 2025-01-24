package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


    Optional<Book> findByNameBook(String nameBook);

    Optional<Book>  findByNameAuthor (String nameAuthor);

    List<Book> findAll ();
}
