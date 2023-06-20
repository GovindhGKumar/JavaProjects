package oops;

interface Tvremote1
{
	public void brandname();
	public void year();
	public void warranty();
}

interface SmartTVremote
{
	public void specs();
	public void price();
}

class TV implements Tvremote1,SmartTVremote
{

	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("specs TV");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price TV");
	}

	@Override
	public void brandname() {
		// TODO Auto-generated method stub
		System.out.println("Brand TV");
	}

	@Override
	public void year() {
		// TODO Auto-generated method stub
		System.out.println("Year TV");
	}

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		System.out.println("Warranty TV");
	}
	
}

public class TVremote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TV ob=new TV();
ob.specs();
ob.price();
ob.brandname();
ob.year();
ob.warranty();
	}

}
