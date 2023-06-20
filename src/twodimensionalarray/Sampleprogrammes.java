package twodimensionalarray;

import java.util.Scanner;

public class Sampleprogrammes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="meter";
		String s1=" perfomance testing tool";
		System.out.println(s.concat(s1));
		System.out.println("Enter the sentence");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		if(st.contains("language"))
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
	}

}
