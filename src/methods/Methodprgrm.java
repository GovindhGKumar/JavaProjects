package methods;

public class Methodprgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodprgrm m=new Methodprgrm();
		m.add();
		System.out.println("The subtractionresult is"+" "+m.sub());
		System.out.println("The multiplication result is"+" "+m.mul(5, 6));
		m.div(12,5);
		
		

	}
	public void add()					//without returntype & parametres
	{
		int a=15,b=20;
		int c=a+b;
		System.out.println("The addition result is"+" "+c);
	}
	
	public int sub()					//with returntype & without parametres
	{
		int a= 50,b=30;
		int c=a-b;
		return c;
	}
	
	public int mul(int a,int b)			//with returntype & parametres
	{
		int c= a*b;
		return c;
	}
	
	public void div(double a,double b)
	{
		double c= a/b;
		System.out.println("The division result is"+" "+c);
	}

}

