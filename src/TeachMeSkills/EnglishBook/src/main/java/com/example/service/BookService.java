package com.example.service;

import com.example.dto.BookDto;
import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private final Logger log = Logger.getLogger(Book.class.getName());
    public Book bookInfo;
    public Book bookFullDescription;

    public boolean isDataEmpty(){
        return bookRepository.count()==0;
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public void save(BookDto bookDto) {
        Book book = BookMapper.bookDtoToBook(bookDto);
        bookRepository.save(book);
    }
    public void saveFullDescription(Book)

    public void addListOfBooks() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("books.txt");
        if (inputStream == null) {
            System.err.println("File not found here");
            return;
        }

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try (BufferedReader bufferedReader = createBufferedReader(inputStreamReader)) {
            String line;
            int stringLine = 0;
            while ((line = bufferedReader.readLine()) != null) {
                stringLine++;
                if(stringLine<=3){
                    continue;
                }
                if (!line.isEmpty()) {
                    String[] data = line.split("\\|");
                    if (data.length >= 3) {
                        String nameBook = data[0];
                        String nameAuthor = data[1];
                        String genre = data[2];
                        String description = data[3];
                        bookInfo = new Book(nameBook, nameAuthor, genre, description);
                        bookRepository.save(bookInfo);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Error reading file");
        }
    }

    public BufferedReader createBufferedReader(InputStreamReader inputStreamReader) {
        return new BufferedReader(inputStreamReader);
    }

    public void readAndSaveDescription(){
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("bookDescription.txt");
        if(inputStream== null){
            System.err.println("file not found");
            return ;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try (BufferedReader bufferedReader = createBufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] data = line.split("\\|");
                    String nameBook = data[0];
                    String fullDescription = data[1];
                    bookFullDescription = new Book(nameBook, fullDescription);
                    bookRepository.save(bookFullDescription);
                }
            }
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }
        catch (IOException e){
            System.err.println(" Error reading file");
        }
    }

    public InputStream getResourceAsStream(String resource) {
        return getClass().getClassLoader().getResourceAsStream(resource);
    }
}
