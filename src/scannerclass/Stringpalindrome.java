package scannerclass;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String r="";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
			}
		System.out.println("Reverse word is "+r);
		
		if(s.equals(r))
		{
			System.out.println("The entered word is palindrome");
			
		}
		else
		{
			System.out.println("The entered word is not palindrome");
		}
	}

}
