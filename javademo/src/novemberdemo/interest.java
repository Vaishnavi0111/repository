package novemberdemo;
import java.util.Scanner;

public class interest {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		int b = in.nextInt();
		int c = in.nextInt();
		double n;
		n=0.0;
		int count=1;
		while(n<=c) 
		{
		n= a+((a*b)/100);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		if(n>=c)
		  System.out.println(count);
		count++;
		a=n;
	    }
	}
}
