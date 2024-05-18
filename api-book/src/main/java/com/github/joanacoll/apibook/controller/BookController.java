package com.github.joanacoll.apibook.controller;

import com.github.joanacoll.apibook.model.Book;
import com.github.joanacoll.apibook.model.BookDto;
import com.github.joanacoll.apibook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("")
    public void createBook(@RequestBody Book book, @RequestParam Long id) {
        bookService.createBook(book, id);
    }

    @GetMapping()
    public List<BookDto> getAllBooks(){
        return bookService.allBooks();
    }

    @GetMapping("/{id}")
    public Book bookById(@PathVariable Long id){
        return bookService.bookById(id);
    }

    @GetMapping("/dto/{id}")
    public BookDto bookDtoById(@PathVariable Long id) {
        return bookService.bookDtoById(id);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}