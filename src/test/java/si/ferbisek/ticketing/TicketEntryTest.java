package si.ferbisek.ticketing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.Month;

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
	
	@Test
	public void hasDate() {
		TicketEntry entry = new TicketEntry(LocalDate.of(2021, Month.NOVEMBER, 19), 50);
		assertEquals(LocalDate.of(2021, 11, 19), entry.getDate());
	}
	
	@Test
	public void hasTodaysDate() {
		TicketEntry entry = new TicketEntry(50);
		assertEquals(LocalDate.now(), entry.getDate());
	}

}
