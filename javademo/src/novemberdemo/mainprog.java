package novemberdemo;

public class mainprog {
	public static void main(String args[])
	{
		shape sh=new shape();
		shape sh1=new shape();
		sh.edge=4;
		sh1.edge=60;
		sh.colour="red";
		System.out.println(sh.edge);
		System.out.println(sh1.edge);
		circle c= new circle();
		System.out.println(c.colours);
		System.out.println(c.edge);
		
	}
	

}
