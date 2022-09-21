package com.ing.demorestapi.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private TicketRepository repository;

    @Autowired
    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    // get all tickets
    public List<Ticket> getAllTickets() {
    // alternative for not overwriting findAll in TicketRepository
//        List<Ticket> ticketList = new ArrayList<>();
//        repository.findAll().forEach(e -> ticketList.add(e));
//        return ticketList;
        return repository.findAll();
    }

    // get one ticket by id
    public Optional<Ticket> getOneTicket(long id) {
        return repository.findById(id);
    }

    // create a new ticket
    public Ticket saveTicket(Ticket ticket) {
        return repository.save(ticket);
    }

    // leave implementation for put and delete for now
}
