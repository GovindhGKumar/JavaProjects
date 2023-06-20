package oops;

class Animal1
{
	public void Animaldetails1()
	{
		System.out.println("Animal details");
	}
	
}
class Dog1 extends Animal1
{
	public void Dog1details()
	{
		System.out.println("dog details");
	}
}

class Tiger extends Animal1
{
	public void Tigerdetails()
	{
		System.out.println("Tiger details");
		
	}
}

public class Animalsdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier ob=new Accessmodifier();
		System.out.println(ob.b);
Dog1 d=new Dog1();
Tiger t=new Tiger();
d.Animaldetails1();
d.Dog1details();
t.Animaldetails1();
t.Tigerdetails();
	}

}
