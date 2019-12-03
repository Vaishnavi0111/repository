package novemberdemo;

public class Calc extends Thread{
	int sum=0;
	public int total() throws InterruptedException{
		
		for(int i=0;i<100;i++) {
			sum+=i;
		}
		return sum;
		
	}
	
	public void run() {
		try {
			total();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
