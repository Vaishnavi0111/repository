package novemberdemo;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {

	public static void main(String[] args) {
		TreeMap<Integer, String> lhm= new TreeMap<Integer, String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the key value: " );
		int x = sc.nextInt();
		lhm.put(11, "jhgdgthb");
		lhm.put(33, "aygfgh");
		lhm.put(23, "yewuor");
		lhm.put(1, "badkiasd");
		lhm.put(34, "hedsuf");
		lhm.put(23, "ewoprei");
    Set<Map.Entry<Integer,String>> kv=lhm.entrySet();
	    for(Map.Entry<Integer,String> k: kv) {
			if((k.getKey())>x) {
				System.out.println(k.getKey()+" : " + k.getValue());
			}
			}
		}

}
