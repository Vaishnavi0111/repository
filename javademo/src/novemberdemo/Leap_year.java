package novemberdemo;
import java.util.Scanner;
public class Leap_year {
   public static void main(String[] args)
   {
	   Scanner in = new Scanner(System.in);
	   int year = in.nextInt();
	   if(year%4==0)
	   {
		   if(year%100==0)
		   {
			   if(year%400==0)
				   System.out.println("LEAP YEAR");
			   else
				    System.out.println("NOT A LEAP YEAR");
		   }
		   else
			   System.out.println("LEAP YEAR");
	   }
	   else
		   System.out.println("NOT A LEAP YEAR");
   }
}
