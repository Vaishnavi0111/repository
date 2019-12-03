package novemberdemo;
import java.util.HashSet;
public class HashsetDemo {
  public static void main(String[] args) {
	  HashSet<String> hs = new HashSet<String>();
	  hs.add("Sam");
	  hs.add("Hello");
	  hs.add("Ravi");
	  hs.add("Hello");
	  HashSet hs2 = hs;
	  System.out.println(hs);
	  System.out.println(hs.size());
	  System.out.println(hs2.equals(hs));
	  Object[] str = hs.toArray();
	  System.out.println(str[0]);
	  System.out.println(hs.hashCode());
	  System.out.println(hs2.hashCode());
	  System.out.println(hs.toString());
	  for(Object s:str)
		  System.out.println(s);
	  System.out.println("Array"+str);
  }
}
