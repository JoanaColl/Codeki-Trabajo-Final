package com.github.joanacoll.apibook.utils;

import com.github.joanacoll.apibook.model.Book;
import com.github.joanacoll.apibook.model.BookDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookUtils {
    public List<BookDto> bookMapperList(List<Book> books) {
        List<BookDto> bookDtoList = new ArrayList<>();
        for (Book b : books){
            bookDtoList.add(new BookDto(b.getId(), b.getTitle(), b.getAuthor()));
        };
        return bookDtoList;
    }

    public BookDto bookMapper(Book book){
        return new BookDto(book.getId(), book.getTitle(), book.getAuthor());
    }
}