package novemberdemo;

public class Loopsdemo {
	public static void main(String[] args) {
		int x=0;
		for(x=1;x<9;x++)
			System.out.println(x);
	int y[] = new int[4];
	for(int z = 0; z<y.length;z++)
	{
		y[z]=x;
		x++;
		System.out.println(x);
	}
	System.out.println("Enhanced forloop:");
	for(int u:y)
	{`
		System.out.println(u);
	}
	System.out.println("Enhanced forloop using string");
	String str[]= {"dio","mock","go"};
	for(String u:str)
	{
		System.out.println(u);
	}
	
	}
}
