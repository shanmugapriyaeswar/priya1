package aaaa;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		int n;
		int rem;
		int rev=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
