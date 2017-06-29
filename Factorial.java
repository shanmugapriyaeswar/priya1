package yyy;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int fact=1;
		int n;
		int i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
