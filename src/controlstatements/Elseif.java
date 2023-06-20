package controlstatements;

public class Elseif {

	public static void main(String[] args) {
		int a=40,b=55,c=26;
		if(a>b && a>c)
		{
			System.out.println("A is Greater");
			
		}
		else if(b>a && b>c)
		{
             System.out.println("B is Greater");		
		}
		else
		{
			System.out.println("C is Greater");
		}
	}

}
