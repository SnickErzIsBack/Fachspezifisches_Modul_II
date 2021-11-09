import Singleton.SingletonKlasse;
import erbauer.Auto;
import erbauer.Auto.Kraftstoff;
import erbauer.Auto.Typ;
import fabrik.ITicket;
import fabrik.SommerTicket;
import fabrik.Ticket;
import fabrik.TicketFabrik;
import fabrik.WinterTicket;
import observer.KundeNeuForm;
import observer.KundenAnzeige;

public class Program {

	public static void main(String[] args) {
		// ----------- Singleton Beispiel ------------------------------------------
		// Da der Konstruktor private ist, kann auﬂerhalb kein Objekt erzeugt werden
		//SingletonKlasse singleton = new SingletonKlasse();
		SingletonKlasse singleton1 = SingletonKlasse.getInstance();
		singleton1.x = 100;
		SingletonKlasse singleton2 = SingletonKlasse.getInstance();
		singleton2.x = 200;
		System.out.println(SingletonKlasse.getInstance().x);

		
		// ------------ Fabrik Methoden Beispiel -------------------------------------
		
		Ticket ticket1 = new SommerTicket();
		Ticket ticket2 = new WinterTicket();
		ITicket ticket3 = new SommerTicket();
		ticket1.printTicket();
		ticket1.getBezeichnung();
		ticket3.printTicket();
		
		ITicket ticket = TicketFabrik.getTicket();
		ticket.printTicket();
		
		// ---------------- Erbauer / Builder Beispiel ----------------------------------
		//Auto auto1 = new Auto(7, Typ.SPORTWAGEN, Kraftstoff.DIESEL, 5, 300);
		Auto auto = new Auto.Erbauer(Typ.SPORTWAGEN).setKraftstoff(Kraftstoff.DIESEL).setAnzahlSitze(50).setAnzahlTueren(4).erbaue();
		Auto auto2 = new Auto.Erbauer(Typ.VAN).setAnzahlSitze(8).setKraftstoff(Kraftstoff.ELEKTRO).setAnzahlTueren(5).erbaue();
		//auto.setKraftstoff(Kraftstoff.DIESEL);
		System.out.println(auto.getAnzahlSitze() + " " + auto.getKraftstoff() + " " + auto.getAnzahlTueren());
		System.out.println(auto2.getAnzahlSitze() + " " + auto2.getKraftstoff() + " " + auto2.getAnzahlTueren());
		
		// ----------------- Observer / Beobachter Pattern --------------------------------
		KundeNeuForm kundeNeuForm = new KundeNeuForm();
		kundeNeuForm.setVisible(true);
		
		KundenAnzeige kundeAnzeige = new KundenAnzeige();
		kundeAnzeige.setVisible(true);
		
	}

}
