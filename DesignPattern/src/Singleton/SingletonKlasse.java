package Singleton;

public class SingletonKlasse {

	public int x;
	private static SingletonKlasse singleton = null; // Objekt/Klasseninstanz
	
	// Methode liefert immer das gleiche Objekt zurück, und beim ersten Aufruf initialisiert
	public static SingletonKlasse getInstance() {
		if(singleton == null) {
			singleton = new SingletonKlasse();
		}
		return singleton;
	}
	
	// private Konstruktor - keine Objekte außerhalb erzeugbar
	private SingletonKlasse() {
		
	}
	
}
