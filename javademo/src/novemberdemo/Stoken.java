package novemberdemo;

import java.util.StringTokenizer;

public class Stoken {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello World","e");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		//System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
	}

}
