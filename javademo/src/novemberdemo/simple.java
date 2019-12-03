package novemberdemo;
import java.util.*;

public class simple {
      public static void main(String[] args) {
    	 /*   int num1=10;
    	   // Integer num2=num1;//autoboxing
    	    Integer num2 = Integer.valueOf(num1);
    	    System.out.println(num2);
    	    //int num3=num2;
    	    int num3=num2.intValue();//auto unboxing
    	    System.out.println(num2);
    	    ArrayList arr = new ArrayList();
    	    /*arr.add("a");
    	    arr.add("b");
    	    arr.add("c");
    	    //System.out.println(arr);
    	    Iterator itr = arr.iterator();
    	    while(itr.hasNext())
    	    {
    	    	System.out.println(itr.next());
    	    }*/
    	  Vector<String> v = new Vector<String>();
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  v.add("LOSS");
    	  v.add("SANDY");
    	  v.add("THARSH");
    	  v.add("THARSH");
    	  System.out.println(v);
    	  System.out.println(v.capacity());
    	  System.out.println(v.contains("THARSH"));
    	  System.out.println(v.elementAt(2));
    	  System.out.println(v.get(2));
    	  System.out.println(v.firstElement());
    	  System.out.println(v.elementAt(30));
    	  //Vector<String> v4=v;
    	  Vector<String> v4=(Vector<String>) v.clone();
    	  System.out.println(v4);
    	  
      }

}
