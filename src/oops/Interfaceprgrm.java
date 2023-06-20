package oops;

interface basicanimal
{
	public void eat();
	public void sleep();
}

class monkey
{
	public void jump()
	{
		System.out.println("monkey jump");	
		}
	public void bite()
	{
		System.out.println("monkey bite");
	}
}

class human extends monkey implements basicanimal

{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep");
	}

	}

	

public class Interfaceprgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
human ob=new human();
ob.sleep();
ob.eat();
ob.jump();
ob.bite();

	}

}
