package it.oncode.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.oncode.mongo.model.Address;

public interface AddressRepository extends MongoRepository<Address, String>{
    
}
