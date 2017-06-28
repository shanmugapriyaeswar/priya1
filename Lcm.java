package yyy;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) 
	{
		int i;
		int n1;
		int n2;
		int gcd=0;
		int lcm;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		for(i=0;i<=n1&&i<=n2;++i)
		{
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		lcm=(n1*n2)/gcd;
		System.out.println(" "+lcm);
		

	}

}
