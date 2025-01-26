package com.example.controller;

import com.example.dto.BookDto;

import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public String library(Model model){
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "library";
    }

    @PostMapping()
    public String library(@ModelAttribute("book")BookDto bookDto,
                          BindingResult bindingResult,
                          Model model){
        if(bindingResult.hasErrors()){
            return "home";
        }
        return "library";
    }
}
