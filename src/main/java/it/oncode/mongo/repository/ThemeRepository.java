package it.oncode.mongo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.oncode.mongo.model.Theme;

@Repository
public interface ThemeRepository extends MongoRepository<Theme, String> {
    
}
