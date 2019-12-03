package novemberdemo;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) 
	{
	 Scanner in = new Scanner(System.in);
	 int num1 = in.nextInt();
	 int num2 = in.nextInt();
	 System.out.println("The two numbers before swapping are "+num1+" "+num2);
	 num1=num1+num2;
	 num2=num1-num2;
	 num1=num1-num2;
	 System.out.println("The two numbers after swapping are "+num1+" "+num2);
	}

}
