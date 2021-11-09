import java.util.Random;

public class Geldkarte extends Thread{
	
	Konto konto;
	double betrag; // Betrag der vom Konto abgehoben werden soll
	
	public Geldkarte(Konto konto) {
		this.konto = konto;
	}
	
	public void geldAbheben(double betrag) {
		this.betrag = betrag;
	}
	
	@Override
	public void run() {
		// solange ein Thread den Quellcode durchläuft, müssen anderen Threads warten
		// ...................
		synchronized(konto) {
			if(konto.getGuthaben() >= betrag) {
				try {
					Thread.sleep(new Random().nextInt(3000) + 500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				konto.setGuthaben( konto.getGuthaben() - betrag );
				System.out.println("Geldbetrag " + betrag + " wurde ausgezahlt. Kontostand: " + 
						konto.getGuthaben());
			}else {
				System.out.println("Keine Auszahlung! Nicht genügend Guthaben");
			}
		}
		
	}
	
}
