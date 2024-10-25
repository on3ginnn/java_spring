package spring_projects.spring_project.library.controller;

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
import spring_projects.spring_project.library.model.Authors;
import spring_projects.spring_project.library.repository.AuthorRepository;
import org.webjars.NotFoundException;

@RestController
@RequestMapping("/authors")
@Tag(name="Авторы", description = "Контроллер для работы с авторами")
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Operation(description = "Получить запись по id", method = "getOneById")
    @RequestMapping(value = "/getOneById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Authors> getOneById(@RequestParam(value="id") Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorRepository.findById(id).orElseThrow(() -> new NotFoundException("Данные не найдены")));
    }

}
