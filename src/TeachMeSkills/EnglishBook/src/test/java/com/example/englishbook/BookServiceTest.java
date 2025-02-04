package com.example.englishbook;

import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveBook() throws IOException {
        // Mocking the InputStream and BufferedReader
        InputStream inputStream = mock(InputStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        // Mocking the method to get InputStream
        BookService bookServiceSpy = spy(bookService);
        doReturn(inputStream).when(bookServiceSpy).getResourceAsStream("books");
        doReturn(bufferedReader).when(bookServiceSpy).createBufferedReader(any(InputStreamReader.class));
        when(bufferedReader.readLine()).thenReturn("Book1|Author1|Description1", null);

        // Calling the method to be tested
        bookServiceSpy.addListOfBooks();

        // Verifying that the bookRepository.save method was called with the correct parameters
        verify(bookRepository).save(new Book("Book1", "Author1", "genre", "Description1"));
    }
}
