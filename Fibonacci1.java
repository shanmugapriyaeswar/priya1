package code;
import java.util.*;
public class Fibonacci1 {

	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3;
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
