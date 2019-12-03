package novemberdemo;
import java.util.*;
public class TreeSetDemo {
   public static void  main(String[] args) {
	  /* TreeSet<String> ts = new TreeSet<String>();
	   ts.add("vijay");
	   ts.add("ajay");
	   ts.add("anu");
	   ts.add("nisha");
	   System.out.println(ts);
	   TreeSet<String> ts1 = new TreeSet<String>(ts);
	   System.out.println(ts1);
	   TreeSet<Integer> ts2 = new TreeSet<Integer>(new MyComparator());
	   ts2.add(23);
	   ts2.add(45);
	   ts2.add(1);
	   ts2.add(21);
	   ts2.add(56);
	   System.out.println(ts2);*/
	   TreeSet<String> ts3 = new TreeSet<String>(new MyComparator());
	   ts3.add("vijay");
	   ts3.add("ajay");
	   ts3.add("anu");
	   ts3.add("nisha");
	   ts3.add("vaish");
	   System.out.println(ts3);
   }
}
