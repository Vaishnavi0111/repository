package novemberdemo;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Product{
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
		int n;
		int result=-1;
		int temp=0;
	    n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		List list = (list) Arrays.asList(arr);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			temp=arr[i]*arr[j];
			if(Arrays.asList(arr).contains(temp) && result<temp){
				result = temp;
			}
		}
	}
	System.out.println(result);
}
}
