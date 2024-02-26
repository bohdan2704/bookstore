package com.example.bookshop.service;

import com.example.bookshop.dto.BookDto;
import com.example.bookshop.dto.CreateBookDto;

import java.util.List;

public interface BookService {
    BookDto save(CreateBookDto book);

    List<BookDto> findAll();

    BookDto findById(Long id);
}
