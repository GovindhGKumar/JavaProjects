package methods;

public class Shapesprgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapesprgrm s=new Shapesprgrm();
System.out.println("The area of rectangle is"+s.rectangle());
System.out.println("The area of circle is"+s.circle(5));
s.triangle();
s.square(6);

	
	
	}
	public void triangle()
	{
		int a=5,b=4;
		double areaT=0.5*a*b;
		System.out.println("The area of triangle is"+areaT);
		
	}
	public int rectangle()
	{
		int a=6,b=5;
		int c=a*b;
		return c;
	}
	public double circle(double a)
	{
		double areaC=3.14*a*a;
		return areaC;
	}
	public void square(int a)
	{
	
		int areaS=a*a;
		System.out.println("The are of square is"+areaS);
	}
	
	

}
