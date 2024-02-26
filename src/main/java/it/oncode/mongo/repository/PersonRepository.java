package it.oncode.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.oncode.mongo.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    
}
