package br.com.florere.model;

import java.time.LocalDate;
import java.util.Objects;

public class Ticket {
	private int id;
	private String name;
	private String message;
	private LocalDate created_at;

	public Ticket() {
		
	}
	
	public Ticket(int id, String name, String message, LocalDate created_at) {
		this.id = id;
		this.name = name;
		this.message = message;
		this.created_at = created_at;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDate getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	@Override
	public int hashCode() {
		return Objects.hash(created_at, id, message, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(created_at, other.created_at) && Objects.equals(id, other.id)
				&& Objects.equals(message, other.message) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", message=" + message + ", created_at=" + created_at + "]";
	}
	
	
	
}
