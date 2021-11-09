package Singleton;

public class SingletonKlasse {

	public int x;
	private static SingletonKlasse singleton = null; // Objekt/Klasseninstanz
	
	// Methode liefert immer das gleiche Objekt zur�ck, und beim ersten Aufruf initialisiert
	public static SingletonKlasse getInstance() {
		if(singleton == null) {
			singleton = new SingletonKlasse();
		}
		return singleton;
	}
	
	// private Konstruktor - keine Objekte au�erhalb erzeugbar
	private SingletonKlasse() {
		
	}
	
}
