package com.example.service;

import com.example.entity.Book;
import com.example.entity.FullBookDescription;
import com.example.repository.BookRepository;
import com.example.repository.FullDescriptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private  FullDescriptionRepository descriptionRepository;

    public Book bookInfo;
    public FullBookDescription bookFullDescription;

    public boolean isDataEmpty() {
        return bookRepository.count() == 0;
    }

    public boolean isDataDescriptionEmpty() {return descriptionRepository.count() == 0;}

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public List<FullBookDescription> findAllDescription() {
        return descriptionRepository.findAll();
    }

    public Optional<Book> findByIdBook (Long id){
        return bookRepository.findById(id);
    }
    public Optional<FullBookDescription> findByIdDescription (Long id){
        return descriptionRepository.findById(id);
    };


    public void addListOfBooks() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("books.txt");
        if (inputStream == null) {
            log.error("File not found here (method void addListOfBooks)");
            return;
        }

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try (BufferedReader bufferedReader = createBufferedReader(inputStreamReader)) {
            String line;
            int stringLine = 0;
            while ((line = bufferedReader.readLine()) != null) {
                stringLine++;
                if (stringLine <= 3) {
                    continue;
                }
                if (!line.isEmpty()) {
                    String[] data = line.split("\\|");
                    if (data.length >= 3) {
                        String nameBook = data[0].trim();
                        String nameAuthor = data[1].trim();
                        String genre = data[2].trim();
                        String description = data[3];
                        bookInfo = new Book(nameBook, nameAuthor, genre, description);
                        bookRepository.save(bookInfo);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            log.error("File not found (method void addListOfBooks)");
        } catch (IOException e) {
            log.error("Error reading file (method void addListOfBooks)");
        }
    }

    public BufferedReader createBufferedReader(InputStreamReader inputStreamReader) {
        return new BufferedReader(inputStreamReader);
    }

    public void readAndSaveDescription() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("bookDescription.txt");
        if (inputStream == null) {
            log.error("file not found (method void readAndSaveDescription)");
            return;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try (BufferedReader bufferedReader = createBufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] data = line.split("\\|");
                    String nameBook = data[0];
                    String fullDescription = data[1];
                    bookFullDescription = new FullBookDescription(nameBook, fullDescription);
                    descriptionRepository.save(bookFullDescription);
                }
            }

        } catch (FileNotFoundException e) {
            log.error("File not found (method void readAndSaveDescription)");
        } catch (IOException e) {
            log.error(" Error reading file (method void readAndSaveDescription)");
        }
    }
    public List<Book> sortingBook(String genre){
        String trimGenreBook = genre.trim();
        log.info("Sorting genre -> " + trimGenreBook);

        List<Book> genreBook = bookRepository.findByGenreIgnoreCase(trimGenreBook);
        genreBook.forEach(book -> log.info("books found " + book.getNameBook()));
//        List<Book> sortedBook = genreBook.stream()
//                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
//                .collect(Collectors.toList());
//        sortedBook.forEach(book -> System.err.println("Book" + book.getNameBook()));
        return genreBook;
    }

    public InputStream getResourceAsStream(String resource) {
        return getClass().getClassLoader().getResourceAsStream(resource);
    }
}
