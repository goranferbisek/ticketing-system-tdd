package si.ferbisek.ticketing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TicketTest {
	
	@Test
	public void canAddTimeEntry() {
		Ticket t = new Ticket("Testing");
		t.add(new TicketEntry(60));
		
		assertEquals(1, t.getEntries().size());
	}
	
	@Test
	public void canHaveNoEntries() {
		Ticket t = new Ticket("Testing");
		assertEquals(0, t.getEntries().size());
	}
	
	@Test
	public void canChangeName() {
		Ticket t = new Ticket("Testing");
		t.setName("Changed");
		
		assertEquals("Changed", t.getName());
	}
	
	@Test
	public void hasSumOfTicketEntries() {
		Ticket t = new Ticket("Testing");
		t.add(new TicketEntry(25));
		t.add(new TicketEntry(15));
		t.add(new TicketEntry(5));
		t.add(new TicketEntry(15));
		
		assertEquals(60, t.workSum());
	}

}
