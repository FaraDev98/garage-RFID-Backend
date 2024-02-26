package it.oncode.mongo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.oncode.mongo.dto.BookResponseDto;
import it.oncode.mongo.model.Book;
import it.oncode.mongo.repository.BookRepository;
import it.oncode.mongo.repository.ThemeRepository;

@RestController
@RequestMapping(value = "/api/v1/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping(value = "/")
    public ResponseEntity<Book> createNewBook(@RequestBody Book bookRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookRepository.insert(bookRequest));
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = bookRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(books);
    }  
}
