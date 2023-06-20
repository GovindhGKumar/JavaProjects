package scannerclass;

import java.util.Scanner;

public class Evenoddintegers {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner sum=new Scanner(System.in);
		int n=sum.nextInt();
		int c=0,d=0;
		for(int i=1;i<=n;i++)
		{
			if(n%2==0)
			{
				c=c+n;
			}
			else
			{
				d=d+n;
		
			}
			System.out.println("The sum of even number is"+" "+c);
			System.out.println("The sum of odd number is"+" "+d);
		}

	}

}
