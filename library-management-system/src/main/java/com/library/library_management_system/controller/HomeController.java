package com.library.library_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.library.library_management_system.model.Book;
import com.library.library_management_system.model.User;
import com.library.library_management_system.repository.BookRepository;
import com.library.library_management_system.repository.UserRepository;

@Controller
public class HomeController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping({"/", "/home"})
    public String index(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("user", new User());
        model.addAttribute("bookList", bookRepository.findAll());
        model.addAttribute("userList", userRepository.findAll());
        return "index";
    }
}
