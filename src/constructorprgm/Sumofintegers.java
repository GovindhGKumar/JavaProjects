package constructorprgm;

import java.util.Scanner;

public class Sumofintegers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
Sumofintegers su=new Sumofintegers();
System.out.println("The sum of entered values are "+su.sum(a));
	}
	
public int sum(int a)
{
	int r,s=0; 
	
while(a>0)
{
    
    r=a%10;
	s=s+r;
	a=a/10;
	
	
}
return s;


	}

}
