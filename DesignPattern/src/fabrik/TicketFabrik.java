package fabrik;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Fabrik Klasse enth�lt die Fabrik-Methode die f�r die Erzeugung der Objekte verantwortlich ist
public class TicketFabrik {

	// Fabrik-Methode
	public static ITicket getTicket() {
		ITicket ticket = null;
		int monat = new GregorianCalendar().get(Calendar.MONTH) + 1;
		
		if(monat >= 5 && monat <= 9) {
			ticket = new SommerTicket();
		}else {
			ticket = new WinterTicket();
		}
		
		return ticket;
	}
	
}
