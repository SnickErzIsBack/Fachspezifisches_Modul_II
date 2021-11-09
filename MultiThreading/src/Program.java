
public class Program {

	public static void main(String[] args) {
		System.out.println("Main-Start");
		
		// synchron
		//ThreadVariante1 t1 = new ThreadVariante1();
		//t1.run();
		
		Thread t1 = new Thread(new ThreadVariante1());
		t1.setName("t1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		Thread t2 = new Thread(new ThreadVariante1());
		t2.setName("t2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		//t3.interrupt(); // Löst InterruptedException
		
		try {
			t1.join(); // HauptThread wartet bis Thread t1 beendet wurde
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//new Thread( new Uhr() ).start();
		ThreadVariante2 t3 = new ThreadVariante2("t3");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//Prüfen ob Thread läuft
		if(t3.isAlive()) {
			System.out.println("isAlive");
		}else {
			System.out.println("isNotAlive");
		}
		
		System.out.println("Main-Ende");
		
		
		// ThreadVariante 3
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread");
			}
		}).start();
		
		
	}
	
	

}
