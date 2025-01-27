package org.napalabls.ru.JPA_homework.controller;

import jakarta.transaction.Transactional;
import org.napalabls.ru.JPA_homework.dto.Person;
import org.napalabls.ru.JPA_homework.repository.PersonRepository;
import org.napalabls.ru.JPA_homework.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    private PersonService personService;

    @PostMapping("/addRecordPerson")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        System.out.println(savedPerson);
        return ResponseEntity.ok(savedPerson);
       // return null;
    }

}