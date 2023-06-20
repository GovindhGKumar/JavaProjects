package constructorprgm;

public class Sampleprgrm {
	
	int Id;
	String Name;
	int Age;
	public Sampleprgrm(int Id, String Name, int Age)
	{
		this.Id=Id;
		this.Name=Name;
		this.Age=Age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sampleprgrm s=new Sampleprgrm(45,"Rohit",39);
		System.out.println(s.Id);
		System.out.println(s.Name);
		System.out.println(s.Age);
		
	}

}
