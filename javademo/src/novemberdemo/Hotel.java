package novemberdemo;
import java.util.*;
public class Hotel {
	static Scanner in = new Scanner(System.in);
	static int choice =0;
	static String ch="";
	static int c;
	public static void roomType(int choice) throws RoomAlreadyBookedException {
		System.out.println("Choose room type:");
		System.out.println("1. Luxury Double Room");
		System.out.println("2.Deluxe Double Room"); 
		System.out.println("3. Luxury Single Room");
		System.out.println("4.Deluxe Single Room"); 
		switch(choice) {
		case 1:c=in.nextInt();
		System.out.println("Number of double beds : 1"); 
		System.out.println("AC : Yes"); 
		System.out.println("Free breakfast : Yes"); 
		System.out.println("Charge per day:4000"); 
		break;
		case 2:c=in.nextInt();
			System.out.println("Number of rooms available : 20");
			break;
		case 3:c=in.nextInt();
			System.out.println("Choose room number from : \r\n" + "1,2,3,4,5,6,7,8,9,10\r\n" ); 
				System.out.println("Enter room number: \n" );
				int room=in.nextInt();
				if(room>=1 && room<=10) {
				while(room==10 || room==3) {
						throw new RoomAlreadyBookedException("Room is already Booked please select some other rooms");	
				}
				//room=in.nextInt();
				
				System.out.println("Enter customer name: \n" );
				in.next();
				System.out.println("Enter contact number: \n" );
				in.nextLong();
				}
				else
					System.out.println("Sorry Not available");
				break;
			
		}
		
	}
	
	public static void menu() {
		System.out.println("==========");
		System.out.println("Menu:");
		System.out.println("=========="); 
		System.out.println("1. Sandwich Rs.50");
		System.out.println("2. Pasta Rs.60"); 
		System.out.println("3. Noodles Rs.70");
		System.out.println("4. Coke Rs.30");
		System.out.println("Enter your choice:");
		int menu=in.nextInt();
		System.out.println("***************Enjoy your meals***************");
	}
	
	
	public static void main(String[] args) throws RoomAlreadyBookedException {
		
		do {
			System.out.println("Enter your choice :");
			System.out.println("1.Display room details");
			System.out.println("2.Display room availability");
			System.out.println("3. Book");
			System.out.println("4.Order food");
			System.out.println("5.Checkout");
			System.out.println("6.Exit");
			choice = in.nextInt();
			switch(choice) {
			case 1:roomType(choice);
				   	System.out.println("Continue : (y/n)");
				   	ch=in.next();
				   	break;
			case 2:roomType(choice);
			  		System.out.println("Continue : (y/n)");
			  		ch=in.next();   
			  		break;
			case 3:roomType(choice);
					System.out.println("Continue : (y/n)");
					ch=in.next(); 
					break;
			case 4:menu();
					System.out.println("Continue : (y/n)");
					ch=in.next(); 
				break;
			case 5:System.out.println("Thanks for Staying in our Hotel");
					System.out.println("Continue : (y/n)");
					ch=in.next(); 
				break;
			case 6: System.out.println("*********************");
					System.out.println("Continue : (y/n)");
					ch=in.next(); 
				break;
			
			}
			
		}while(ch.equals("y"));	
		
		
		
	}
	
	
}

	
		