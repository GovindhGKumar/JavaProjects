package twodimensionalarray;

import java.util.Scanner;

public class Foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a[][]=new int[4][3];
		System.out.println("Enter the number");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The entered numbers are");
		for(int s[]:a)
		{
			for(int s1:s)
					{
						System.out.println(s1);
					}
		}
	}

}
