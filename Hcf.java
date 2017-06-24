package aaaa;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) 
	{
		int n1;
		int n2;
		int i;
		int hcf = 0;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		for(i=0;i<=n1||i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			
				hcf=i;
			
		}
		System.out.println(" "+hcf);

	}

}
