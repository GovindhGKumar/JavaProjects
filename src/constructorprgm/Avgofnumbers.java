package constructorprgm;

import java.util.Scanner;

public class Avgofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Avgofnumbers av=new Avgofnumbers();
System.out.println("The average of numbers are"+av.avg(a, b, c));
	}
	
public int avg( int a, int b, int c)
{
	int s=0;
	s=((a+b+c)/3);
	return s;
}

	}

	



