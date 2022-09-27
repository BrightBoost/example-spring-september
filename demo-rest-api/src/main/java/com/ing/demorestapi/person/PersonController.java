package com.ing.demorestapi.person;

import com.ing.demorestapi.ticket.Ticket;
import com.ing.demorestapi.ticket.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/person")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    // get all - GET
    @GetMapping("")
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> persons = service.getAllPersons();
        return ResponseEntity.of(Optional.of(persons));
    }

    // get one by id - GET
    @GetMapping("/{id}") // /api/person/3
    public ResponseEntity<Person> getOnePerson(@PathVariable long id) {
        Optional<Person> p = service.getOnePerson(id);
        return ResponseEntity.of(p);
    }

    // create new ticket - POST
    @PostMapping("")
    public ResponseEntity<Person> createPerson(@RequestBody @Valid Person person) {
        Person p1 = service.savePerson(person);
        return ResponseEntity.of(Optional.of(p1));
    }
}
