package si.ferbisek.ticketing;

import java.time.LocalDate;

public class TicketingSystemApp {
	
    public static void main( String[] args ) {
    	TicketingSystem tickets = TicketingSystem.getInstance();
    	
        //make some tickets with time entries
    	Ticket planning = new Ticket("Planing");
    	Ticket implementing = new Ticket("Implementing");
    	Ticket testing = new Ticket("Testing");
    	tickets.add(planning);
    	tickets.add(implementing);
    	tickets.add(testing);
    	
    	LocalDate today = LocalDate.now();
    	LocalDate yesterday = today.minusDays(1);
    	LocalDate monthAgo = today.minusMonths(1);
    	
    	planning.add(new TicketEntry(yesterday, 50));
    	planning.add(new TicketEntry(yesterday, 10));
    	
    	implementing.add(new TicketEntry(yesterday, 30));
    	testing.add(new TicketEntry(10));
    	implementing.add(new TicketEntry(270));
    	
    	planning.add(new TicketEntry(monthAgo, 50));
    	
    	//izpiši celotno delo
    	for (Ticket t: tickets.getTickets()) {
    		for (TicketEntry e: t.getEntries()) {
    			System.out.println(e.getDate() + " " + t.getName() + " " + e.getDuration() + " miniutes");
    		}
    		
    	}
    	
    	//preveri na katerih ticketih je koliko dela v enem dnevu
    	
    	
    	
    	//preveri koliko je na posameznem ticketu v celotni zgodovini
    	System.out.println();
    	Ticket t = tickets.getTickets().get(1);
    	int sum = 0;
    	for (TicketEntry e: t.getEntries()) {
    		sum += e.getDuration();
    	}
    	System.out.println("Amount of work done on ticket \"" + t.getName() + "\" is " + sum + " minutes");
    }
}
