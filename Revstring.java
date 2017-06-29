package yyy;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) 
	{
		String s1;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		int len=s1.length();
		String reverse="";
		for(int i=len-1;i>-1;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
