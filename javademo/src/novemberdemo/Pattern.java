package novemberdemo;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	int limit = in.nextInt();
    	for(int i=1;i<=limit;i++)
    	{
    	 for(int j=1;j<=i;j++)
    	 {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.print("\n");
    	}
    }
}
