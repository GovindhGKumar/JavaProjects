package array;

import java.util.Scanner;

public class Inputpositive {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		if(n<0)
		{
			System.out.println("Sorry,you cannot enter a negative number");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count=count+1;
					
				}
			}
			if(count>2)
			{
				System.out.println("The number is not a Prime number");
			}
			else
			{
				System.out.println("The number is a Prime number");
			}
		}
		
		
	}
	}
