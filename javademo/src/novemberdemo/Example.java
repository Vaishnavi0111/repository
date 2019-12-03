package novemberdemo;

public class Example {
       public static void main(String[] args) {
    	   String str1="Hello";
    	   String str2=str1;
    	   String str3=new String("World");
    	   String str4=new String("hello");
    	   str1.concat("World");
    	   System.out.println(str1);
    	   System.out.println(str1==str3);
    	   System.out.println(str1.equals(str4));
    	   System.out.println(str1.equalsIgnoreCase(str4));
    	   StringBuffer sb = new StringBuffer("Hello");
    	   System.out.println(sb);
    	   sb.append(" World");
    	   System.out.println(sb);
       }
}
