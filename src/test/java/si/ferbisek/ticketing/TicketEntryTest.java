package si.ferbisek.ticketing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketEntryTest {
	
	TicketEntry entry;
	
	@BeforeEach
	public void init() {
		entry = new TicketEntry(40);
	}
	
	@Test
	public void hasDuration() {
		int duration = entry.getDuration();
		assertEquals(40, duration);
	}

}
