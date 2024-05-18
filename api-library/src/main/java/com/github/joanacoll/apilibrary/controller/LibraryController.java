package com.github.joanacoll.apilibrary.controller;

import com.github.joanacoll.apilibrary.model.BookDto;
import com.github.joanacoll.apilibrary.model.Library;
import com.github.joanacoll.apilibrary.model.LibraryBookDto;
import com.github.joanacoll.apilibrary.service.BookClient;
import com.github.joanacoll.apilibrary.service.ILibraryService;
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
@RequestMapping("/api/library")
public class LibraryController {

    ILibraryService libraryService;
    BookClient bookClient;

    public LibraryController(ILibraryService libraryService, BookClient bookClient) {
        this.libraryService = libraryService;
        this.bookClient = bookClient;
    }

    @PostMapping("")
    public Library createLibrary(@RequestBody Library library) {
        return libraryService.createLibrary(library);
    }

    @GetMapping("")
    public List<Library> getAllLibrary() {
        return libraryService.allLibraries();
    }

    @GetMapping("/{id}")
    public Library libraryById(@PathVariable Long id) {
        return libraryService.libraryById(id);
    }

    @GetMapping("/book")
    public LibraryBookDto getLibraryBook(@RequestParam Long id) {
        Library libraryBd = libraryService.libraryById(id);
        BookDto bookDto = bookClient.bookDtoById(libraryBd.getIdBook());
        return libraryService.getLibraryBook(id, bookDto);
    }

    @PutMapping("/update")
    public Library updateLibrary(@RequestBody Library library) {
        return libraryService.updateLibrary(library);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id) {
        libraryService.deleteLibrary(id);
    }
}