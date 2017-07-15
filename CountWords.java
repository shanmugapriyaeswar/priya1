package code;
import java.util.*;
public class CountWords {

	public static void main(String[] args)
	{
		String str;
		int count=1;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int a=str.length();
		for(int i=1;i<a-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		s.close();
		System.out.println(count);

	}

}
