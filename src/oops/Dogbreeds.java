package oops;

class Animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}

class Dog extends Animal
{
	public void breed()
	{
		System.out.println("Pomeranian");
	}
}

class Babydog extends Dog
{
	public void Babydog()
	{
		System.out.println("Babydog");
	}
}

public class Dogbreeds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Babydog b=new Babydog();
		b.animalfood();
		b.breed();
		b.Babydog();
	}

}
