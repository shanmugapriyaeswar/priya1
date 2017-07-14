package code;
import java.util.*;
public class NumericChar {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				count++;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Number of numeric character is:"+count);
		
		

	}

}
