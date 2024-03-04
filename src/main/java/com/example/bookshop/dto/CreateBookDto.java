package com.example.bookshop.dto;

import java.math.BigDecimal;

public record CreateBookDto(
        String title,
        String author,
        String isbn,
        BigDecimal price,
        String description,
        String coverImage
) {}
