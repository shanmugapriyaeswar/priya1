package code;
import java.util.*;
public class Day {

	public static void main(String[] args) 
	{
		
		String str[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Scanner s=new Scanner(System.in);
		//str=s.nextLine();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=="sunday")
				System.out.println("false");
			else
				System.out.println("true");
		}
		

	}

}
