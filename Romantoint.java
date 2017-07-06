package code;

import java.util.Scanner;

public class Romantoint {

	public static void main(String[] args)
	{
		System.out.println("Enter the no");
		Decimal2Roman();
	}
	public static void Decimal2Roman()
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>0&&num<4000)
		{
			String thou[]= {"","M","MM","MMM"};
			String hun[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
			String ten[]= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
			String unit[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
			int th=num/1000;
			int h=(num/100)%10;
			int t=(num/10)%10;
			int n=num%10;
			System.out.println("The Roman number of"+num+"is"+thou[th]+hun[h]+ten[t]+unit[n]);
		}
		else
			System.out.println("\n you entered a number out of range");
		}
		
	}


