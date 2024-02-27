package com.example.bookshop;

import com.example.bookshop.model.Book;
import com.example.bookshop.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookshopApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookshopApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            // Your code to run and test here
            System.out.println("Hello, CommandLineRunner is running!");

            Book book = new Book();
            book.setTitle("Java Programming");
            book.setAuthor("John Doe");
            book.setPrice(BigDecimal.valueOf(29.99));
            book.setIsbn("978-0134685991");
            bookService.save(book);
        };
    }
}
