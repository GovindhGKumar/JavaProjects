package twodimensionalarray;

import java.util.Scanner;

public class Vowelsprgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int c=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				c++;
			}
		}
			System.out.println("vowel count is"+" "+c);
		
		
	
			
		
		
	}

}
