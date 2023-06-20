package scannerclass;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner number=new Scanner(System.in);
		int rev=0,r;
		int n=number.nextInt();
		int temp=n;
		
			while(n>0)
			{
				r=n%10;
				rev=(rev*10)+r;
				n=n/10;
			}
			System.out.println(rev);
			if(rev==temp)
			{
				System.out.println("The Entered number is Palindrome");
			}
			else
			{
				System.out.println("The Entered number is not a Palindrome");
			}

	}

}
