package code;
import java.util.*;
public class Specialchar {

	

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
			{
				
				continue;
			}
			else
			{
				
				count++;
			}

		}
		System.out.println("Number of special character is:"+count);

	}

}
