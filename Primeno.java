package aaaa;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) 
	{
		int i,c,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<=n;i++)
		{
			c=0;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
				c++;
			}
			}
			if(c==0)
				System.out.println(" "+i);
			
			}
		
		}
		}
	

		

	


