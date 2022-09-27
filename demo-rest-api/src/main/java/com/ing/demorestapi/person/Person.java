package com.ing.demorestapi.person;

import com.ing.demorestapi.ticket.Ticket;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long strid;
    private String name;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    Set<Ticket> tickets;

    public long getStrid() {
        return strid;
    }

    public void setStrid(long strid) {
        this.strid = strid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
