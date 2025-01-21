package com.example.mapper;

import com.example.dto.BookDto;
import com.example.entity.Book;

public class BookMapper {


    public static Book bookDtoToBook (BookDto bookDto){
        Book book = new Book();
        book.setNameBook(bookDto.getNameBook());
        book.setNameAuthor(bookDto.getNameAuthor());
        book.setDescription(bookDto.getDescription());
        return book;
    }
}
