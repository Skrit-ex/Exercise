package com.example.englishbook;

import com.example.entity.Book;
import com.example.service.BookService;
import com.example.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.mockito.Mockito.*;

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
        InputStream inputStream = mock(InputStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        BookService bookServiceSpy = spy(bookService);
        doReturn(inputStream).when(bookServiceSpy).getResourceAsStream("books");
        doReturn(bufferedReader).when(bookServiceSpy).createBufferedReader(any(InputStreamReader.class));
        when(bufferedReader.readLine()).thenReturn("NameBook|Author|Genre|Description", (String) null);

        bookServiceSpy.addListOfBooks();

        verify(bookRepository).save(new Book("NameBook", "Author", "Genre", "Description"));
    }
}
