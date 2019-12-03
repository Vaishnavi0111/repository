package novemberdemo;

public class Rectangle {
	   int width=25;
	   int height=15;
	   void display()
	   {
		   System.out.println("Width and Height of the rectangle are "+width+" "+height);
	   }
}
class RectangleArea extends Rectangle{
	void read_input() {
		System.out.println(width);
		System.out.println(height);
	}
	void display()
	   {
		   //System.out.println("Width and Height of the rectangle are "+width+height);
		   System.out.println("Area of the rectangle is "+(width*height));
	   }
	public static void main(String[] args) {
		RectangleArea rect=new RectangleArea();
		rect.read_input();
		rect.display();
	}
	
}

