package si.ferbisek.ticketing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(entries, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(entries, other.entries) && Objects.equals(name, other.name);
	}

}
