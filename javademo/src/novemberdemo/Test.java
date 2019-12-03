package novemberdemo;

public class Test {
     int x=66;
     int y=20;
     static  String name;
     Test(){
    	 System.out.println("Constructor");
     }
     static {
         Test t = new Test();
    	 System.out.println("inside static block");
    	 name="aavvvcc";
    	 System.out.println(t.x);
     }
     {
    	x=100;
    	System.out.println("inside instance");
     }
     public static void main(String[] args)
     {
    	 System.out.println("inside main method"); 
     }
}
