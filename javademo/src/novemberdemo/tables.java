package novemberdemo;
import java.util.*;
public class tables {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int limit = in.nextInt();
		int i;
		for(i=1;i<=limit;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}

}
