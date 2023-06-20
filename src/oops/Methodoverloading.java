package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodoverloading ob=new Methodoverloading();
ob.add();
ob.add(25, 30);
ob.add(25, 30.5);

	}
		public void add()
		{
			int a=20,b=20,c;
			c=a+b;
			System.out.println(c);
			
			
		}
		public void add(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
	}

		public void add(int a,double b)
		{
			double c=a+b;
			System.out.println(c);
		}
}
