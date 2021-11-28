package si.ferbisek.ticketing;

import java.util.ArrayList;
import java.util.List;

public class TicketingSystem {
	
	List<Ticket> tickets;
	
	public TicketingSystem() {
		tickets = new ArrayList<Ticket>();
	}
	
	public void add(Ticket t) {
		tickets.add(t);
	}
	
	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public Ticket getByName(String name) {
		return tickets.stream()
				.filter(ticket -> name.equals(name))
				.findAny()
				.orElse(null);
	}

}
