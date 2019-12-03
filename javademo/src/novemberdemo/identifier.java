package novemberdemo;

import java.util.Scanner;

public class identifier {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int i,count=0,max=0;
	    if((str.charAt(0)>='a' && str.charAt(0)<='z')||(str.charAt(0)>='A'&& str.charAt(0)<='z')) 
	    {
	       max++;
	    }
	    if(max==0)
	    	 System.out.println("Error 1");
	    for(i=0;i<str.length();i++)
	    {
	    	if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='0'&&str.charAt(i)<='9')||str.charAt(i)=='_')
	    	 count++;
	    }
	    	if(count==str.length())
               System.out.print("No Error");
	    	else
	    		System.out.println("Error 2");
	    	
	    				
	}
	}


