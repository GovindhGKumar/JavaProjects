package oops;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
		int a=20,b=0;
		int c=a/b;
}																										//	Runtime Exception
catch(Exception e)
{
System.out.println(e.getMessage());
System.out.println("hii");
}
try
{
String s=null;
System.out.println(s.length());
}
catch(Exception s)
{
System.out.println(s.getMessage());	
System.out.println("hello");

}

}
}
