package novemberdemo;
import java.util.*;
public class ArrayListDemo1 {
      public static void main(String[] args)
      {
    	  ArrayList arr = new ArrayList();
    	  arr.add(23);
    	  arr.add(34);
    	  arr.add(56);
    	  arr.add(12);
    	  System.out.println("The orginal array is "+arr);
    	  Collections.reverse(arr);
    	  System.out.println("The reversed array is "+arr);
      }
}
