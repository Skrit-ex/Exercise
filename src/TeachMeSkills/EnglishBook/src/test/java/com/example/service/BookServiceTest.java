package com.example.service;

import com.example.entity.Book;
import com.example.entity.FullBookDescription;
import com.example.repository.BookRepository;
import com.example.repository.FullDescriptionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private FullDescriptionRepository fullDescriptionRepository;
    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void readAndSaveDescription() throws IOException {
        InputStream inputStream = mock(InputStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        BookService bookServiceSpy = spy(bookService);
        doReturn(inputStream).when(bookServiceSpy).getResourceAsStream("bookDescription");
        doReturn(bufferedReader).when(bookServiceSpy).createBufferedReader(any(InputStreamReader.class));
        when(bufferedReader.readLine()).thenReturn("NameBook|Description", null);

        bookServiceSpy.readAndSaveDescription();

        verify(fullDescriptionRepository).save(new FullBookDescription("NameBook", "Description"));

    }
}