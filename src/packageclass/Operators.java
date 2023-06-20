package packageclass;

public class Operators {

	public static void main(String[] args) {
		int a=20,b=40;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		int c=30,d=15;
		System.out.println("c+=d="+(c+=d)); //c+=d means c=c+d
		System.out.println("c-=d="+(c-=d));
		
		System.out.println(a<b);
		System.out.println(b<a);
		System.out.println(c==d);
		
		String username="Govindh";
		String pswrd="18";
		System.out.println(username=="Govindh" && pswrd=="19");
		System.out.println(username=="Govindh" || pswrd=="19");
		System.out.println(!(username=="Govindh"));
		
		int a1=5;
		System.out.println(a1++); //post increment
		System.out.println(a1);
		System.out.println(a1++);
		System.out.println(a1);
		System.out.println(--a1); //pre increment
		
		

	}

}
