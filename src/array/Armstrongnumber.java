package array;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		
System.out.println("Enter the Number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int r,n,sum=0;
int m=a;

while(a>0)
{
	r=a%10;
	n=(r*r*r);
	sum=sum+n;
	a=a/10;

}
if(sum==m)
{
	System.out.println("The number is Armstrong");
	
}
else
{
	System.out.println("The number is not Armstrong");
}
	
}
}



