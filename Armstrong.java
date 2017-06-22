package aaaa;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		int n,temp=0,s1,arm,d,no;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		d=n;
		while(n>0)
		{
			no=n%10;
			n=n/10;
			temp=temp+no*no*no;
			
		}
		if(d==temp)
		{
			System.out.println("Is an Armstrong number");
			
		}
		else 
		{
			System.out.println("Is not an Armstrong number");
		}
	}

}
