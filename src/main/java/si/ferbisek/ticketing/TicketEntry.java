package si.ferbisek.ticketing;

public class TicketEntry {
	
	private int duration;
	//private somekindofdate date;
	
	public TicketEntry(int minutes) {
		this.duration = minutes;
	}
	
	public int getDuration() {
		return this.duration;
	}
}
