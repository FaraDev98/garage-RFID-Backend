package it.oncode.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.oncode.mongo.model.Address;
import it.oncode.mongo.repository.AddressRepository;

@RestController
@RequestMapping(value = "/api/v1/address", produces = MediaType.APPLICATION_JSON_VALUE)
public class AddressController {
    
    @Autowired
    private AddressRepository addressRepository;
    @PostMapping(value = "/")
    public ResponseEntity<Address> createNewAddress(@RequestBody Address addressRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(addressRepository.insert(addressRequest));
    }
}
