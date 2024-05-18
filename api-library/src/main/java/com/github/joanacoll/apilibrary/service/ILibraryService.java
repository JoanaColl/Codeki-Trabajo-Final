package com.github.joanacoll.apilibrary.service;

import com.github.joanacoll.apilibrary.model.BookDto;
import com.github.joanacoll.apilibrary.model.Library;
import com.github.joanacoll.apilibrary.model.LibraryBookDto;

import java.util.List;

public interface ILibraryService {
    Library createLibrary(Library library);
    Library libraryById(Long id);
    List<Library> allLibraries();
//    LibraryBookDto getLibraryBook(Library library, BookDto bookDto);
    LibraryBookDto getLibraryBook(Long idLibrary, BookDto bookDto);

    Library updateLibrary(Library library);
    void deleteLibrary(Long id);
}
