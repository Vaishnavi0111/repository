package novemberdemo;

public class User {
	int id;
	String name;
	double salary;
	User(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	User(int id, String name,double salary)
	{
		this(id,name);
		this.salary=salary;
	}
    public static void main(String[] args)
    {
    	User user = new User(10,"Ram");
    	User user1 = new User(11,"Anu",23456);
    	System.out.println(user.id+" "+user.name);
    	System.out.println(user1.salary);
    	
    }
}
