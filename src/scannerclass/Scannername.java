package scannerclass;

import java.util.Scanner;

public class Scannername {

	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		Scanner name=new Scanner(System.in);
		String st=name.nextLine();  //nextLine=for reading names including spaces.
									//char c=st.next().charAt(2)--This displays 2nd letter of the word.
		System.out.println(st);
		
		
		

	}

}
