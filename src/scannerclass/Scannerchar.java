package scannerclass;

import java.util.Scanner;

public class Scannerchar {

	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		Scanner name=new Scanner(System.in);
		char c=name.next().charAt(2);
		System.out.println(c);
		

	}

}
