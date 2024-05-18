package com.github.joanacoll.apilibrary.model;

public class LibraryBookDto {
    private Long idLibrary;
    private String nameLibrary;
    private BookDto book;

    public LibraryBookDto(Long idLibrary, String nameLibrary, BookDto book) {
        this.idLibrary = idLibrary;
        this.nameLibrary = nameLibrary;
        this.book = book;
    }

    public LibraryBookDto() {
    }

    public Long getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(Long idLibrary) {
        this.idLibrary = idLibrary;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public BookDto getBook() {
        return book;
    }

    public void setBook(BookDto book) {
        this.book = book;
    }
}