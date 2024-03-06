package com.example.bookshop.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public record CreateBookDto(
        @NotBlank
        @Size(max = 100)
        String title,
        @NotBlank
        @Size(max = 100)
        String author,
        @Size(min = 10, max = 13)
        String isbn,
        @Min(0)
        BigDecimal price,
        @Size(max = 1000)
        String description,
        String coverImage
) {}
