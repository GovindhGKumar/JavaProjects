package scannerclass;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter the First number");
		Scanner oper=new Scanner(System.in);
		double n=oper.nextInt();
		System.out.println("Enter second number");
		double m=oper.nextInt();
		System.out.println("Select the operation 1.add 2.sub 3.mult 4.div");
		int c=oper.nextInt();
		double result=0;
		switch(c)
		{case 1:result=n+m;
				break;
		case 2: result=n-m;
				break;
		case 3: result=n*m;
				break;
		case 4: if(n==0)
			{
			System.out.println("Error");
			}
		else
		{
			
			result=n/m;
			}
				break;
				
		default:System.out.println("Invalid Choice");
		}
		
System.out.println("The result is"+" "+result);
	}

}
