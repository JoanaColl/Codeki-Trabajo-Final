package com.github.joanacoll.apibook.controller;

import com.github.joanacoll.apibook.model.Author;
import com.github.joanacoll.apibook.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("")
    public void createAuthor(@RequestBody Author author){
        authorService.createAuthor(author);
    }

    @GetMapping("")
    public List<Author> getAllAuthors (){
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author authorById(@PathVariable Long id){
        return authorService.authorById(id);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.deleteAuthor(id);
    }
}