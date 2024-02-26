package it.oncode.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.oncode.mongo.model.Theme;
import it.oncode.mongo.repository.ThemeRepository;

@RestController
@RequestMapping(value = "/api/v1/theme")
public class ThemeController {
    @Autowired
    private ThemeRepository themeRepository;

    @PostMapping(value = "/")
    public ResponseEntity<Theme> createNewBook(@RequestBody Theme themeRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(themeRepository.insert(themeRequest));
    }
}
