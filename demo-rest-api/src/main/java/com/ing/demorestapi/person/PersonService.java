package com.ing.demorestapi.person;

import com.ing.demorestapi.ticket.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    // get one ticket by id
    public Optional<Person> getOnePerson(long id) {
        return repository.findById(id);
    }

    // create a new ticket
    public Person savePerson(Person person) {
        return repository.save(person);
    }

}
