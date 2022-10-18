package br.com.florere.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.florere.model.Ticket;

@Repository
public class TicketRepository {
	List<Ticket> tickets = new ArrayList<>();
	
	public TicketRepository() {
		tickets.add(new Ticket(1, "teste", "teste", LocalDate.of(2000, 10, 10)));
	}
	
	public List<Ticket> findAll() {
		return tickets;
	}
}
