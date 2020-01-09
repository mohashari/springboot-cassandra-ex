package com.monggopesen.trycassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public PersonService() {
    }

    public void create() {
        personRepository.save(new Person(UUID.randomUUID().toString(), "muklis", 24));
    }
}

@RestController
class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/")
    public ResponseEntity<?> create() {
        personService.create();
        return new ResponseEntity<>("ok", HttpStatus.CREATED);
    }
}
