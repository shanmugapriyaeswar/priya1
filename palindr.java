import java.util.Scanner;
class palindr
{
public static void main(String args[])
{
int sum=0,n,temp,r;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a palindrome");
}
}
}
