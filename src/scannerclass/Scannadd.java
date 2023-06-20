package scannerclass;

import java.util.Scanner;

public class Scannadd {

	public static void main(String[] args) {
		
		System.out.println("Enter first number to add");
		Scanner add=new Scanner(System.in);
		int a=add.nextInt();
		System.out.println("Enter second number to add");
		int b=add.nextInt();
		
		int c=a+b;
		System.out.println("The Sum of entered numbers are"+" "+c);
		

	}

}
