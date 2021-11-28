package si.ferbisek.ticketing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TicketingSystemTest {

	@Test
	public void canEnterATicketWithDuration() {
		TicketingSystem tickets = new TicketingSystem();
		Ticket ticket = new Ticket("testing");
		ticket.add(new TicketEntry(60));
		tickets.add(ticket);

		int duration = tickets.getTickets().get(0).getEntries().get(0).getDuration();
		assertEquals(60, duration);
	}
	
	@Test
	public void canGetTicketByName() {
		TicketingSystem tickets = new TicketingSystem();
		Ticket ticket = new Ticket("testing");
		tickets.add(ticket);
		
		Ticket found = tickets.getByName("testing");
		assertEquals(ticket, found);
	}

}
