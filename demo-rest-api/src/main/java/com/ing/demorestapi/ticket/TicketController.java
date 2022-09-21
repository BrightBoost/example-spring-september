package com.ing.demorestapi.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/ticket")
public class TicketController {
    private TicketService service;

    @Autowired
    public TicketController(TicketService service) {
        this.service = service;
    }

    // get all - GET
    @GetMapping("")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = service.getAllTickets();
        return ResponseEntity.of(Optional.of(tickets));
    }

    // get one by id - GET
    @GetMapping("/{id}") // /api/ticket/3
    public ResponseEntity<Ticket> getOneTicket(@PathVariable long id) {
        Optional<Ticket> ticket = service.getOneTicket(id);
        return ResponseEntity.of(ticket);
    }

    // create new ticket - POST
    @PostMapping("")
    public ResponseEntity<Ticket> createTicket(@RequestBody @Valid Ticket ticket) {
        Ticket ticket1 = service.saveTicket(ticket);
        return ResponseEntity.of(Optional.of(ticket1));
    }

    // edit a ticket - PUT
    @PutMapping("")
    public ResponseEntity<Ticket> editTicket(@RequestBody Ticket ticket) throws Exception {
        Ticket updateTicket = service.updateTicket(ticket);
        return ResponseEntity.of(Optional.of(updateTicket));
    }


    // delete - DELETE

}
