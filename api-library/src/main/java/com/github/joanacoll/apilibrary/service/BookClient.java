package com.github.joanacoll.apilibrary.service;

import com.github.joanacoll.apilibrary.model.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "api-book")
public interface BookClient {
    @GetMapping("/api/book")
    List<BookDto> getAllBooks();

    @GetMapping("/api/book/dto/{id}")
    BookDto bookDtoById(@PathVariable Long id);
}