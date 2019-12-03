package novemberdemo;
import java.util.*;
public class ArrayListDemo {
public static void main(String args[]) {
	ArrayList arr=new ArrayList();
	for(int i=1;i<=100;i++) {
		arr.add(i);
	}
	Iterator it=arr.iterator();
	int sum=0;
	while(it.hasNext()) {
		int num = (int) it.next();
	       if(num%2==0) 
	    	   sum+=num;
      }
	System.out.println(sum);
}
}