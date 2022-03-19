package si.ferbisek.ticketing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TicketingSystem {
	
	private static TicketingSystem instance = null;
	
	private List<Ticket> tickets;
	
	
	private TicketingSystem() {
		tickets = new ArrayList<Ticket>();
	}
	
	public static TicketingSystem getInstance() {
		if (instance == null) {
			return new TicketingSystem();
		}
		return instance;
	}
	
	public void add(Ticket t) {
		if (!tickets.contains(t)) {
			tickets.add(t);
		}
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
	
	public List<TicketEntry> getEntriesByDate(LocalDate date) {
		return tickets.stream()
					.flatMap(t -> t.getEntries().stream())
					.filter(e -> e.getDate().equals(date))
					.collect(Collectors.toList());
	}
	
	public static int sumOfWork(List<TicketEntry> entries) {
		return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tickets);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketingSystem other = (TicketingSystem) obj;
		return Objects.equals(tickets, other.tickets);
	}

}
