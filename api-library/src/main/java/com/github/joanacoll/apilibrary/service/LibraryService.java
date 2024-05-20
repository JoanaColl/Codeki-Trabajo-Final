package com.github.joanacoll.apilibrary.service;

import com.github.joanacoll.apilibrary.exception.ResourceNotFoundException;
import com.github.joanacoll.apilibrary.model.BookDto;
import com.github.joanacoll.apilibrary.model.Library;
import com.github.joanacoll.apilibrary.model.LibraryBookDto;
import com.github.joanacoll.apilibrary.repository.ILibraryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService implements ILibraryService{

    ILibraryRepository libraryRepository;
    BookClient bookClient;

    public LibraryService(ILibraryRepository libraryRepository, BookClient bookClient) {
        this.libraryRepository = libraryRepository;
        this.bookClient = bookClient;
    }

    @Override
    public Library createLibrary(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public Library libraryById(Long id) throws ResourceNotFoundException {
        return libraryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Library not found", "Library", "id", id));
    }

    @Override
    public List<Library> allLibraries() {
        return libraryRepository.findAll();
    }

    @Override
    public List<LibraryBookDto> allLibraryBooks() {
        List <Library> libraryList = libraryRepository.findAll();
        List<LibraryBookDto> libraryBookListDto = new ArrayList<>();
        for (Library l: libraryList) {
            BookDto bookDto = bookClient.bookDtoById(l.getIdBook());
            libraryBookListDto.add(new LibraryBookDto(l.getId(), l.getName(), bookDto));
        }
        return libraryBookListDto;
    }

    @Override
    public LibraryBookDto getLibraryBook(Long id, BookDto bookDto) throws ResourceNotFoundException {
        Library library = libraryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Library not found", "Library", "id", id));
        return new LibraryBookDto(id, library.getName(), bookDto);
    }

    @Override
    public Library updateLibrary(Library library) throws ResourceNotFoundException {
        libraryRepository.save(library);
        return libraryRepository.findById(library.getId()).orElseThrow(()-> new ResourceNotFoundException("Library not found", "Library", "id", library.getId()));
    }

    @Override
    public void deleteLibrary(Long id) throws ResourceNotFoundException {
        libraryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Library not found", "Library", "id", id));
        libraryRepository.deleteById(id);
    }
}