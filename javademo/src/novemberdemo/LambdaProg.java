package novemberdemo;


public class LambdaProg {
	public static void main(String[] args) {
			EvenInterface even = (a)->(a%2==0)?"Even number":"Odd number";
			System.out.println(even.EvenNumber(21));
			
		
		}

	}


