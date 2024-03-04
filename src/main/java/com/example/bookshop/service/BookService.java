package com.example.bookshop.service;

import com.example.bookshop.dto.BookDto;
import com.example.bookshop.dto.CreateBookDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookDto createBookDto);

    BookDto findById(Long id);

    List<BookDto> findAll();

    BookDto updateById(Long id, CreateBookDto createBookDto);

    void deleteById(Long id);
}
