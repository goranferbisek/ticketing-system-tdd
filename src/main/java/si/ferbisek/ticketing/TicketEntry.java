package si.ferbisek.ticketing;

public class TicketEntry {
	
	private int duration;
	//private somekindofdate date;
	
	public TicketEntry(int minutes) {
		setDuration(minutes);
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
