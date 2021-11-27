package si.ferbisek.ticketing;

import java.time.LocalDate;

public class TicketEntry {
	
	private int duration;
	private LocalDate date;
	
	public TicketEntry(int minutes) {
		this.date = LocalDate.now();
		setDuration(minutes);
	}
	
	public TicketEntry(LocalDate date, int minutes) {
		this.date = date;
		setDuration(minutes);
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int minutes) {
		if (minutes < 0) {
			throw new IllegalArgumentException(this.getClass() + ": Ticket entry duration must be a positive number");
		}
		this.duration = minutes;
	}
}
