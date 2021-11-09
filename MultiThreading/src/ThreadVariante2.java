
public class ThreadVariante2 extends Thread{

	public ThreadVariante2(String name) {
		setName(name);
		//setDaemon(true); beendet Thread sobald Anwendung beendet wird
		start();
		
	}
	
	@Override
	public void run() {
		System.out.println("Thread-Test");
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try {
				Thread.sleep(100); // Wartet 100ms
			} catch (InterruptedException e) {
				i = 50;
				//e.printStackTrace();
			}
		}
	}
	
}
