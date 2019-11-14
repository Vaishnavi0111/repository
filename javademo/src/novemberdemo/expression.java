package novemberdemo;
import java.util.Scanner;
public class expression {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int count=0;
		if((a+b)==c)
		{
			System.out.println("Add");
			count++;
		}
		 if((a-b)==c)
		 {
			System.out.println("Subtract");
			count++;
		 }
		 if((a*b)==c)
		 {
			 System.out.println("Multiply");
			 count++;
		 }
		 if((a/b)==c)
		 {
			 System.out.println("Divide");
			 count++;
		 }
		 if((a%b)==c)
		 {
			 System.out.println("Modulus");
			 count++;
		 }
		 if(count==0)
             System.out.println("Not Possible");
			
}
}