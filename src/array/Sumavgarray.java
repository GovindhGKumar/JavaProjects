package array;

import java.util.Scanner;

public class Sumavgarray {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		double avg;
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
//System.out.println("The sum of numbers are");
for(int i=0;i<5;i++)
{ 
	sum=sum+a[i];
}
	

System.out.println("The average of numbers are");
{
	avg=(sum/5);
   }

	System.out.println(avg);

	}
}

