package iterativesample;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Number");
		Scanner number=new Scanner(System.in);
		int rev=0,r;
		int n=number.nextInt();
		
			while(n>0)
			{
				r=n%10;
				rev=(rev*10)+r;
				n=n/10;
			}
			System.out.println("The reversed number is"+" "+rev);
			}

}
