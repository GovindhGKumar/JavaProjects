package array;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n1=0,n2=1,count,sum;;
int n=sc.nextInt();
System.out.print("0");
for(int i=1;i<=n;i++)
{
	sum=n1+n2;
	n1=n2;
	n2=sum;
	
	System.out.print(n2);
	
}

	}

}
