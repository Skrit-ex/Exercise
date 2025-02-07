package com.example.controller;

import com.example.dto.BookDto;

import com.example.entity.Book;
import com.example.entity.FullBookDescription;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
            System.err.println("error here lib");
            return "home";
        }
        return "library";
    }

    @GetMapping("/viewingBook/{id}")
    public String viewingBook(@PathVariable Long id, Model model){
        List<FullBookDescription> booksDescription = bookService.findAllDescription();
        if(bookService.isDataDescriptionEmpty()){
            System.err.println("Database was empty, the files will added");
            bookService.readAndSaveDescription();
        }else {
            System.err.println("Database is full");
        }

        Optional<Book> bookId = bookService.findByIdBook(id);
        Optional<FullBookDescription> descriptionId = bookService.findByIdDescription(id);
        if(descriptionId.isPresent() && descriptionId.get().getId().equals(bookId.get().getId())){
            model.addAttribute("bookFullDescription", descriptionId.get());
            model.addAttribute("bookDescription", booksDescription);
            }else {
            System.err.println("There is error in equalsId");
            return "viewingBook";
        }
        return "viewingBook";
    }
}
