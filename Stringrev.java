package pro;
import java.util.*;
public class Stringrev {

	public static void main(String[] args)
	{
		String str;
		
		String a="";
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		char ch[]=str.toCharArray();
		int i;
		for(i=ch.length-1;i>=0;i--)
		{
			a=a+ch[i];
		}
		//System.out.println(a);
		
		String x=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(x);

	}

}
