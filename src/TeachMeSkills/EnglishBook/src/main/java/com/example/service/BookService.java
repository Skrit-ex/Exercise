package com.example.service;

import com.example.dao.HibernateBookDao;
import com.example.dto.BookDto;
import com.example.entity.Book;
import com.example.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class BookService {

    @Autowired
    private HibernateBookDao hibernateBookDao;

    public Book bookInfo;

    public void save(BookDto bookDto){
        Book book = BookMapper.bookDtoToBook(bookDto);
        hibernateBookDao.save(book);
    }

    public void saveBook(){
        InputStreamReader inputStreamReader = new InputStreamReader
                (Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("BookFile")));
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if(!line.isEmpty()){
                    String[] data = line.split(",");
                    if(data.length >= 4){
                        String nameBook = data[0];
                        String nameAuthor = data[1];
                        String lastNameAuthor = data[2];
                        String description = readAndSaveDescription();
                        bookInfo = new Book(nameBook,nameAuthor,lastNameAuthor,description);
                        hibernateBookDao.save(bookInfo);
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readAndSaveDescription(){
        InputStreamReader inputStreamReader = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().
                getResourceAsStream("description")));
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String text = "";
            String line = String.valueOf(0);
            while ((line = bufferedReader.readLine()) != null){
                if (!(line.trim().isEmpty())){
                    text += line + " ";
                    bookInfo = new Book();
                    bookInfo.setDescription(text);
                }
            }
        }
        catch (IOException e){
            throw new RuntimeException();
        }
        return bookInfo.getDescription();
    }

}
