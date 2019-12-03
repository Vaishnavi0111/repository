package novemberdemo;
import java.util.*;
public class StackDemo {
  public static void main(String[] args) {
	  Stack<Integer> st=new Stack<Integer>();
	  st.push(25);
	  st.push(78);
	  st.push(65);
	  st.push(34);
	  st.pop();
	  System.out.println(st);
	  Enumeration e = Collections.enumeration(st);
	  while(e.hasMoreElements())
	  {
		  System.out.println(e.nextElement());
	  }
	  System.out.println(st.capacity());
	  System.out.println(st.contains(78));
  }
}
