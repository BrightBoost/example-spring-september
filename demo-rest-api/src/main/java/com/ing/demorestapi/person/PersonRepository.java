package com.ing.demorestapi.person;

import com.ing.demorestapi.ticket.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();
}
