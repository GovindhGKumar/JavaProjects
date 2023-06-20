package oops;

interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
	public void creditcard();
}

class Federel implements Bank
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Federal");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Federal");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance Federal");
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("Federal card");
	}
	
}

class SBI implements Bank
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit SBI");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw SBI");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance SBI");
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("SBI card");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI ob=new SBI();
ob.withdraw();
ob.balance();
ob.creditcard();

Federel fb=new Federel();
fb.withdraw();
fb.balance();
fb.creditcard();

	}

}
