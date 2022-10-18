package br.com.florere.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import br.com.florere.model.Ticket;
import br.com.florere.repository.TicketRepository;

@RestController
@RequestMapping("/api")
public class TicketController {

	private final TicketRepository repository;
	
	public TicketController(TicketRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/findall")
	public List<Ticket> findAll() {
		return this.repository.findAll();
	}
	
	@GetMapping("/testme/{id}")
	public String testMe(@PathVariable String id) {
		return id;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/create")
	public String createTicket(@RequestBody Ticket ticket) {
		return "";
	}
}
