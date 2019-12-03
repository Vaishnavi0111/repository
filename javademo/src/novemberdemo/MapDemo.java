package novemberdemo;
import java.util.*;
public class MapDemo {
  public static void main(String[] args) {
	  TreeMap<Integer,String> t = new TreeMap<Integer,String>();
	  t.put(1,"a");
	  t.put(2,"b");
	  t.put(3,"c");
	  t.put(4,"d");
	  t.put(5,"e");
	  t.put(6,"f");
	  t.put(7,"g");
	  t.put(8,"h");
	  t.put(9,"i");
	  t.put(10,"j");
	  System.out.println(t);
	  System.out.println(t.tailMap(5));
	  
	  
  }
}
