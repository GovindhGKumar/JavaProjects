package oops;

class car
{
	public void accelerator()
	{
		System.out.println("accelerator");
	}
	
}

class BMW extends car
{

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		super.accelerator();
		System.out.println("BMW accelerator");
	}
	
}


public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW ob=new BMW();
ob.accelerator();
	}

}
