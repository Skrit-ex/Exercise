package com.example.controller;

import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public String library(Model model){
//        bookService.addListOfBooks();
        return "library";
    }
}
