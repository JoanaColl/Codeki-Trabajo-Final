package com.github.joanacoll.apibook.service;

import com.github.joanacoll.apibook.exception.ResourceNotFoundException;
import com.github.joanacoll.apibook.model.Author;
import com.github.joanacoll.apibook.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public void createAuthor(Author author){
        authorRepository.save(author);
    }

    public List<Author> getAllAuthors(){
        List<Author> authors = authorRepository.findAll();
        return authors;
    }

    public Author authorById(Long id) throws ResourceNotFoundException {

        return authorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Author not found", "Author", "id", id));
    }

    public Author updateAuthor(Author author) throws ResourceNotFoundException{
        authorRepository.save(author);
        return authorRepository.findById(author.getId()).orElseThrow(()-> new ResourceNotFoundException("Author not found", "Author", "id", author.getId()));
    }

    public void deleteAuthor(Long id) throws ResourceNotFoundException {
        authorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Author not found", "Author", "id", id));
        authorRepository.deleteById(id);
    }
}