
public class ThreadVariante1 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread-Test");
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try {
				Thread.sleep(100); // Wartet 100ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
