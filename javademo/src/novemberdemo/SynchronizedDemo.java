package novemberdemo;
import java.util.*;
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		MyThread t1 = new MyThread(d,"sai");
		MyThread t2 = new MyThread(d,"ram");
		MyThread t3 = new MyThread(d,"sam");
		MyThread t4 = new MyThread(d,"ajay");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
