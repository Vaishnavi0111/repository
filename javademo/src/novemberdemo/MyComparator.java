package novemberdemo;
import java.util.*;
public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		/*Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;*/
		String s1 = (String)o1;
		String s2 = (String)o2;
		/*if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else 
		    return 0;*/
		return s2.compareTo(s1);
			
	}
	
}
