package com.github.joanacoll.apibook.service;

import com.github.joanacoll.apibook.exception.ResourceNotFoundException;
import com.github.joanacoll.apibook.model.Author;
import com.github.joanacoll.apibook.model.Book;
import com.github.joanacoll.apibook.model.BookDto;
import com.github.joanacoll.apibook.repository.AuthorRepository;
import com.github.joanacoll.apibook.repository.BookRepository;
import com.github.joanacoll.apibook.utils.BookUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookUtils bookUtils;

    public List<BookDto> allBooks(){
        List<Book> books = bookRepository.findAll();
        return bookUtils.bookMapperList(books);
    }

    public Book bookById(Long id) throws ResourceNotFoundException {
        return bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book not found", "Book", "id", id));
    }

    public BookDto bookDtoById(Long id) throws ResourceNotFoundException {
        return bookUtils.bookMapper(bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book not found", "Book", "id", id)));
    }

    public void createBook(Book book, Long authorId) throws ResourceNotFoundException{
        Author author = authorRepository.findById(authorId).orElseThrow(()-> new ResourceNotFoundException("Author not found", "Author", "id", authorId));
        book.setAuthor(author);
        bookRepository.save(book);
    }

    public Book updateBook(Book book) throws ResourceNotFoundException{
        bookRepository.save(book);
        return bookRepository.findById(book.getId()).orElseThrow(()-> new ResourceNotFoundException("Book not found", "Book", "id", book.getId()));
    }

    public void deleteBook(Long id) throws ResourceNotFoundException {
        bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book not found", "Book", "id", id));
        bookRepository.deleteById(id);
    }
}