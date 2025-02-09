package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTestSortingBook {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sortingBook() {

        Book book1 = new Book("nameBook", "nameAuthor", "Fantasy", "descr");
        Book book2 = new Book("nameBook1", "nameAuthor2", "Fantasy", "descr");
        Book book3 = new Book("nameBook2", "nameAuthor3", "Fantasy", "descr");

        List<Book> books = Arrays.asList(book1,book2,book3);

        when(bookRepository.findAll()).thenReturn(books);

        List<Book> sorted = bookService.sortingBook("Fantasy");

//        assertEquals(2, sorted.size());
        assertTrue(sorted.contains(book1));
        assertTrue(sorted.contains(book2));
        assertTrue(sorted.contains(book3));

        verify(bookRepository, times(1)).findAll();

    }
}