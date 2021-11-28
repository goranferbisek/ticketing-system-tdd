package si.ferbisek.ticketing;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	
	private String name;
	private List<TicketEntry> entries;
	
	public Ticket(String name) {
		this.name = name;
		entries = new ArrayList<TicketEntry>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<TicketEntry> getEntries() {
		return entries;
	}
	
	public void add(TicketEntry te) {
		entries.add(te);
	}
	
	public int workSum() {
		return entries.stream().mapToInt(entry -> entry.getDuration()).sum();
	}

}
