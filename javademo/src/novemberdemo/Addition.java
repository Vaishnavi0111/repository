package novemberdemo;

public class Addition {
	  void display(int... add)
	{
		int sum=0;
		for(int i:add)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
   public static void main(String[] args)
   {
	   Addition add = new Addition();
	   add.display(2,3,4);
	   add.display(45,87);
	   add.display(567);
	   /*display(1,2);
	   display(20,30,80);
	   display(25);*/
   }
}
