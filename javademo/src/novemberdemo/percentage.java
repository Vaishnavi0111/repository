package novemberdemo;
import java.util.Scanner;

class percentage {
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int total=in.nextInt();
			int four=in.nextInt();
			int six=in.nextInt();
			double run;
			double x;
			x=total-((4*four)+(6*six));
			run=(x*100)/total;
                      System.out.println(run);
			
	}

}