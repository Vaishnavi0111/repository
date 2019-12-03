package novemberdemo;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		Calc cl= new Calc();
		cl.start();
		
		Thread.sleep(100);
		cl.join();  //sum will be 4950
		System.out.println(cl.sum); //without sleep and join output is 0
		Thread.sleep(1000);
		System.out.println(cl.sum);
		Thread.sleep(1000);
		System.out.println(cl.sum);
		Thread.sleep(1000);
		Cubes c= new Cubes();
		Thread t1= new Thread( c);
		Squares s= new Squares();
		Thread t2= new Thread( s);
		c.run();
		s.run();
		t1.start();
		t2.start();

	}

}
