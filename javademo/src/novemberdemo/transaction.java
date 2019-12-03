package novemberdemo;
import java.util.Scanner;
public class transaction {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER YOUR SECRET PIN NUMBER:");
		int pin = in.nextInt();
		int balance = in.nextInt();
		int deposit = in.nextInt();
		String c;
		do
		{
		System.out.println("********Welcome to the ATM Service**************");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Cash");
		System.out.println("3. Deposit Cash");
		System.out.println("4. Quit");
		System.out.println("*************?*****************?*");
			System.out.println("Enter your choice:");
			int choice = in.nextInt();
			switch(choice)
			{
				case 1:
					  System.out.println("YOUR CURRENT BALANCE IN RS: "+balance);
					  break;
				case 2:
		            System.out.println("ENTER THE AMOUNT TO WITHDRAW: "+deposit);
				
					System.out.println("PLEASE COLLECT YOUR CASH");
					System.out.println("YOUR CURRENT BALANCE IS:"+(balance-deposit));
					break;
				case 3:
					 System.out.println("ENTER THE AMOUNT TO DEPOSIT:");
					 int amount= in.nextInt();
					 System.out.println("YOUR BALANCE IS:"+((balance-deposit)+amount));
					 break;
				case 4:
					  System.out.println("THANK U USING ATM");
					  break;
			
				}
			 System.out.println("Do you wish to continue:");
			 c = in.next();
			}while(c.equals("y"));
		}
		
	}

