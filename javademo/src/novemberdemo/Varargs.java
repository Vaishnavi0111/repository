package novemberdemo;

public class Varargs {
	 static void display(String... str)
	{
		for(String s:str)
			System.out.print(s+" ");
	}
   public static void main(String[] args)
   {
	   display("Hello");
	   display("MY","Name","is","Vaishnavi");
   }
}
