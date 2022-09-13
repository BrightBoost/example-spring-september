package com.ing.demorestapi.ticket;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/ticket")
public class TicketController {
    // get all - GET
    @GetMapping("")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = null;
        return ResponseEntity.of(Optional.of(tickets));
    }

    // get one by id - GET
    @GetMapping("/{id}") // /api/ticket/3
    public ResponseEntity<Ticket> getOneTicket(@PathVariable long id) {
        Ticket ticket = new Ticket();
        return ResponseEntity.of(Optional.of(ticket));
    }

    // create new ticket - POST
    @PostMapping("")
    public ResponseEntity<Long> createTicket(@RequestBody @Valid Ticket ticket) {
        Ticket ticket1 = ticket;
        ticket1.setId(42L);
        System.out.println(ticket);
        return ResponseEntity.of(Optional.of(ticket.getId()));
    }

    // edit a ticket - PUT

    // delete - DELETE

}
