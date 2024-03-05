package com.example.bookshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SoftDelete;

@Entity
@Getter
@Setter
@Table(name = "books")
@SoftDelete
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(max = 100)
    private String title;
    @NotBlank
    @Size(max = 100)
    private String author;
    @NotBlank
    @Size(min = 10, max = 13)
    private String isbn;
    @Min(0)
    private BigDecimal price;
    @Size(max = 1000)
    private String description;
    private String coverImage;
}
