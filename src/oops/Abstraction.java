package oops;

abstract class cars
{
	abstract public void speedlimit();
	public void carengine()
	{
		System.out.println("car engine");
	}
}

class Audi extends cars
{

	@Override
	public void speedlimit() {
		System.out.println("Bmw speedlimit");
		
	}
	
}

class Hyundai extends cars
{

	@Override
	public void speedlimit() {
		System.out.println("Hyundai speedlimit");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hyundai ob=new Hyundai();
ob.carengine();
ob.speedlimit();
Audi au=new Audi();
au.carengine();
au.speedlimit();

	}

}
