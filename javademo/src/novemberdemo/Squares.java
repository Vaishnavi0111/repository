package novemberdemo;

public class Squares extends Thread{

	public static void Squares() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Squares of i is: "+Math.pow(i, 2));
			Thread.sleep(10);
		}
	}
	
	public void run() {
			try {
				Squares();
				wait(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}
