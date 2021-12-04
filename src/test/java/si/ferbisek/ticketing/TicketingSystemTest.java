package si.ferbisek.ticketing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TicketingSystemTest {

	@Test
	public void canEnterATicketWithDuration() {
		TicketingSystem tickets = TicketingSystem.getInstance();
		Ticket ticket = new Ticket("testing");
		ticket.add(new TicketEntry(60));
		tickets.add(ticket);

		int duration = tickets.getTickets().get(0).getEntries().get(0).getDuration();
		assertEquals(60, duration);
	}
	
	@Test
	public void canGetTicketByName() {
		TicketingSystem tickets = TicketingSystem.getInstance();
		Ticket ticket = new Ticket("testing");
		tickets.add(ticket);
		
		Ticket found = tickets.getByName("testing");
		assertEquals(ticket, found);
	}
	
	@Test
	public void hasListOfTickets() {
		TicketingSystem tickets = TicketingSystem.getInstance();
		tickets.add(new Ticket("Ticket1"));
		tickets.add(new Ticket("Ticket2"));
		tickets.add(new Ticket("Ticket3"));
		tickets.add(new Ticket("Ticket4"));
		
		assertEquals(4, tickets.getTickets().size());
	}
	
	@Test
	public void canHaveOnlyOneTicketWithSameName() {
		TicketingSystem tickets = TicketingSystem.getInstance();
		tickets.add(new Ticket("Ticket"));
		tickets.add(new Ticket("Ticket"));
		
		assertEquals(1, tickets.getTickets().size());
	}
	
	@Test
	public void canHaveOnlyOneInstance() {
		TicketingSystem tickets1 = TicketingSystem.getInstance();
		TicketingSystem tickets2 = TicketingSystem.getInstance();
		
		assertEquals(tickets1, tickets2);
	}
	
	@Test
	public void canGetEntriesByDate() {		
		TicketingSystem tickets = TicketingSystem.getInstance();
		Ticket ticket = new Ticket("testing");
		ticket.add(new TicketEntry(10));
		ticket.add(new TicketEntry(20));
		tickets.add(ticket);

		int duration = tickets.getTickets().get(0).getEntries().get(0).getDuration();
		assertEquals(60, duration);
		
	}
	
	@Test
	public void canGetSumOfWork() {
		
	}

}
