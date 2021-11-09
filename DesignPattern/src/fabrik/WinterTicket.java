package fabrik;

public class WinterTicket extends Ticket{
	private double rabatt;
	
	public WinterTicket() {
		super();
		super.setBezeichnung("Winter-Ticket");
		super.setPreis(40);
		this.rabatt = 10;
	}

	public WinterTicket(String bezeichnung, double preis) {
		super(bezeichnung, preis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printTicket() {
		System.out.println("Ticket-Druck");
		System.out.println("Ticket: " + super.getBezeichnung());
		System.out.println("Ticketpreis: " + super.getPreis());
		System.out.println("Bemerkungen: Sie erhalten Rabatt " + this.rabatt);
	}	
	
}
