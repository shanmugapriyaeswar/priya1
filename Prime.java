package program;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args)
	{
		int i,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		for(i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime number");
			
		}
		else
		{
			System.out.println("Not a prime number");
		}
		
	}

}
