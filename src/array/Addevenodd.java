package array;

import java.util.Scanner;

public class Addevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[6];
		Scanner sc=new Scanner(System.in);
		int sum1=0,sum2=0;
		System.out.println("Enter the Numbers");
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
for(int i=0;i<6;i++)
{
if(a[i]%2==0)
{
	sum1=sum1+a[i];
}
else
{
	sum2=sum2+a[i];
}}
System.out.println("Sum of even numbers are"+" "+sum1);
System.out.println("Sum of odd numbers are"+" "+sum2);

	}

}
