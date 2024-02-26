package it.oncode.mongo.controller;

import org.springframework.web.bind.annotation.RestController;

import it.oncode.mongo.model.Person;
import it.oncode.mongo.repository.PersonRepository;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/v1/person", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class PersonController {
    
    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/")
    public ResponseEntity<List<Person>> getAllPeople() {
        return ResponseEntity.status(HttpStatus.OK).body(personRepository.findAll());
    }

}
