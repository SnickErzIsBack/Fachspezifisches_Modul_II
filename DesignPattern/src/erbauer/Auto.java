package erbauer;

public class Auto {
	private int anzahlSitze;
	private Typ typ; 
	private Kraftstoff kraftstoff;
	private int anzahlTueren;
	private int ps;
	
	
	// --------- Builder / Erbauer Klasse -------------------
	// dient zur Erzeugung eines gültigen Auto-Objekts
	public static class Erbauer{
		private Auto auto; // Erzeugt das Auto-Objekt, dass später zurück gegeben wird
		
		public Erbauer(Typ typ) {
			auto = new Auto();
			auto.typ = typ;
			auto.anzahlSitze = 2;
			auto.anzahlTueren = 2;
			auto.ps = 100;
			auto.kraftstoff = Kraftstoff.DIESEL;
			
			if(typ == Typ.KOMBI || typ == Typ.SUV) {
				auto.anzahlTueren = 5;
				auto.anzahlSitze = 5;
			}else if(typ == Typ.VAN) {
				auto.anzahlTueren = 5;
				auto.anzahlSitze = 7;
			}else if(typ == Typ.SPORTWAGEN) {
				auto.kraftstoff = Kraftstoff.BENZIN;
			}else if(typ == Typ.LIMOUSINE) {
				auto.anzahlTueren = 4;
				auto.anzahlSitze = 5;
			}
			
		}
		
		public Erbauer setKraftstoff(Kraftstoff kraftstoff) {
			if(auto.typ == Typ.SPORTWAGEN) {
				auto.kraftstoff = Kraftstoff.BENZIN;
			}else {
				auto.kraftstoff = kraftstoff;
			}
			return this;
		}
		
		public Erbauer setAnzahlSitze(int anzahlSitze) {
			if((anzahlSitze >= 5 && anzahlSitze <= 8) && (auto.typ == Typ.KOMBI | auto.typ == Typ.VAN) ) {
				auto.anzahlSitze = anzahlSitze;
			}else if((anzahlSitze >= 0 && anzahlSitze < 5) && (auto.typ == Typ.LIMOUSINE | auto.typ == Typ.SPORTWAGEN)) {
				auto.anzahlSitze = anzahlSitze;
			}
			
			return this;
		}
		
		public Erbauer setAnzahlTueren(int anzahlTueren) {
			if(anzahlTueren == 2 && auto.typ == Typ.SPORTWAGEN) {
				auto.anzahlTueren = anzahlTueren;
			}else if(anzahlTueren == 4 && auto.typ == Typ.LIMOUSINE) {
				auto.anzahlTueren = anzahlTueren;
			}else if(anzahlTueren == 5) {
				auto.anzahlTueren = anzahlTueren;
			}
			return this;
		}
		
		public Auto erbaue() {
			return auto;
		}
		
	}
	
	public enum Typ{
		SPORTWAGEN,
		LIMOUSINE,
		KOMBI,
		VAN,
		SUV
	}
	
	public enum Kraftstoff{
		DIESEL,
		BENZIN,
		ELEKTRO,
		HYBRID
	}
	
	public Auto() {
		
	}
	
	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public Typ getTyp() {
		return typ;
	}

	public Kraftstoff getKraftstoff() {
		return kraftstoff;
	}

	public int getAnzahlTueren() {
		return anzahlTueren;
	}

	public int getPs() {
		return ps;
	}
	
}
