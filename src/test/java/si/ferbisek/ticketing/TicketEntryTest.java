package si.ferbisek.ticketing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketEntryTest {

	@Test
	public void hasDuration() {
		TicketEntry entry = new TicketEntry(40);
		assertEquals(40, entry.getDuration());
	}
	
	@Test
	public void durationMustBePositiveNumber() {
		assertThrows(IllegalArgumentException.class, () -> new TicketEntry(-5));
	}

}
