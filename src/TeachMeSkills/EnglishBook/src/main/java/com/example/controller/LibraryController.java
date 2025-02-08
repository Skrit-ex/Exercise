package com.example.controller;

import com.example.dto.BookDto;

import com.example.entity.Book;
import com.example.entity.FullBookDescription;
import com.example.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public String library(Model model){
        List<Book> books = bookService.findAll();
        if (books.isEmpty()) {
            model.addAttribute("error", "No books available");
        }
        model.addAttribute("books", books);
        return "library";
    }

    @PostMapping()
    public String library(@ModelAttribute("book")BookDto bookDto,
                          BindingResult bindingResult,
                          Model model){
        if(bindingResult.hasErrors()){
            log.error("error here lib");
            return "home";
        }
        return "library";
    }

    @GetMapping("/viewingBook/{id}")
    public String viewingBook(@PathVariable Long id, Model model){
        List<FullBookDescription> booksDescription = bookService.findAllDescription();
        if(bookService.isDataDescriptionEmpty()){
            log.error("Database was empty, the files will added");
            bookService.readAndSaveDescription();
        }else {
            log.error("Database is full");
        }
            bookService.findByIdBook(id).ifPresent(book -> {
                bookService.findByIdDescription(id).ifPresent(fullBookDescription -> {
                    if (book.getId().equals(fullBookDescription.getId())) {
                        model.addAttribute("bookFullDescription", fullBookDescription);
                        model.addAttribute("bookDescription", booksDescription);
                    } else {
                        log.error("There is an error in equalsId");
                    }
                });
            });
        return "viewingBook";
    }

    @GetMapping("/sortingGenre/{genre}")
    public String sortGenre(@PathVariable String genre,Model model){
        List<Book> sortingGenre = bookService.sortingBook(genre);
        model.addAttribute("genreBook", sortingGenre);
        return "sortingGenre";
    }
}
