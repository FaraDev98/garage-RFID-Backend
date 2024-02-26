package it.oncode.mongo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.oncode.mongo.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    
}
