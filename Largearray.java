package code;
import java.util.*;
public class Largearray {

	public static void main(String[] args) 
	{
		int n;
		int i;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(i=1;i<n;i++)
		{
			
			if(max < a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
