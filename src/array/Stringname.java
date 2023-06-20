package array;

import java.util.Scanner;

public class Stringname {

	public static void main(String[] args) {
		String[] n=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names");
		for(int i=0;i<4;i++)
		{
			n[i]=sc.next();
			
		}
		//System.out.println("The entered names are");
		//for(int i=0;i<4;i++)
		//{
		//	System.out.println(n[i]);
		//}
		System.out.println("The entered names are");
		for(String v:n)
		{
			System.out.println(v);
		}

	}

}
