package novemberdemo;
import java.util.*;
public class ThreadDemo{
	public static void main(String[] args) throws InterruptedException {
		Cubes t1 = new Cubes();
		Squares t2 = new Squares();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Thread.activeCount());
		for(int i=0;i<10;i++)
		{
			System.out.println("i value is :"+i);
			Thread.sleep(10);
		}
	}
}