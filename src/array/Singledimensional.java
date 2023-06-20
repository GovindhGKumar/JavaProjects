package array;

import java.util.Scanner;

public class Singledimensional {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("The entered numbers are");

															//a[0]=5;
			for(int v:a)
			{
				System.out.println(v);
															//a[1]=8;
			}
															//a[2]=9;
															//a[3]=1;
															//a[4]=11;
		
															//System.out.println(a[3])
															//for(int i=0;i<5;i++)

															//System.out.println("The entered numbers are"+" "+a[i]);

	}

}
