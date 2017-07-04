package code;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) 
	{
		String str;
		int count=1;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(int i=1;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(+count);

	}

}
