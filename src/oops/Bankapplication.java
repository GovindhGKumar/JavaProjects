package oops;

import java.util.Scanner;

interface showdetails
{   public void showdetails1();
	public void balance();
	public void deposit();
	public void withdraw();
}

class SBI1 implements showdetails	
{
	String name="Rahul";
	int accountnumber;
	int balance=10000;
	static String bankname="The bank is SBI";
	Scanner sc=new Scanner(System.in);


	@Override
	public void showdetails1() {
		// TODO Auto-generated method stub
		System.out.println("Enter the accountnumber");
		int accountnumber=sc.nextInt();
		System.out.println("The account holder's name is "+name);
		System.out.println(bankname);
	}

	

	@Override
	public void deposit() {
		
		// TODO Auto-generated method stub
		System.out.println("The balance amount in the account is "+balance);
		System.out.println("Enter the deposit amount");
		int depositamount=sc.nextInt();
		balance=balance+depositamount;
		System.out.println("The balance amount is "+balance);
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the withdrawl amount");
		int withdrawlamount=sc.nextInt();
		balance=balance-withdrawlamount;
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("The balance amount is "+balance);
	}
	}
public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI1 sb=new SBI1();
sb.showdetails1();
sb.deposit();
sb.withdraw();
sb.balance();
	}

}