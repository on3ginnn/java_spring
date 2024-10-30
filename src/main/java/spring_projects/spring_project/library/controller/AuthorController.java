package com.start.rayan.library.controller;

import com.start.rayan.library.model.Author;
import com.start.rayan.library.repository.AuthorRepository;
import com.start.rayan.library.repository.BookRepository;
import com.start.rayan.library.repository.GenericRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;


@RestController
@RequestMapping("/authors") //http://localhost:8080/authors
@Tag(name = "Авторы", description = "Контрллер для роботы с авторами из библиотеки")
public class AuthorController extends GenericController<Author> {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    protected AuthorController(GenericRepository<Author> genericRepository, BookRepository bookRepository,
                               AuthorRepository authorRepository) {
        super(genericRepository);
        this.bookRepository = bookRepository;
        this.authorRepository= authorRepository;
    }

    @Operation(description =  "Добавить книгу к автору")
    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Author> getOneById(@RequestParam(value = "id") Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorRepository.findById(id).orElseThrow(() -> new NotFoundException("Данные не найдены")));


    }
}
