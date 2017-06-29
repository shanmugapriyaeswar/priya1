package yyy;

import java.util.Scanner;

public class Revdigit {

	public static void main(String[] args)
	{
		int n;
		int rev;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			rev=n%10;
			n=n/10;
			System.out.print(rev);
		}
		
	}

}
