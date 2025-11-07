package com.library.library_management_system.controller;
import java.util.List;
import com.library.library_management_system.model.Book;
import com.library.library_management_system.model.User;
import com.library.library_management_system.repository.BookRepository;
import com.library.library_management_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

  


   
    @PostMapping("/books")
    public String addBook(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }

    @PostMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/books/edit/{id}")
public String showEditForm(@PathVariable Long id, Model model) {
    Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id));
    List<User> users = userRepository.findAll();

    model.addAttribute("book", book);
    model.addAttribute("users", users);
    return "edit-book";
}


    @PostMapping("/books/edit/{id}")
    public String updateBook(@PathVariable("id") Long id, @ModelAttribute("book") Book updatedBook) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id));

        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setIsbn(updatedBook.getIsbn());
        book.setUser(updatedBook.getUser()); // ✅ Update user

        bookRepository.save(book);
        return "redirect:/";
    }
}
