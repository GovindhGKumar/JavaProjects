package iterativesample;

public class Count {

	public static void main(String[] args) {
		
		int n=56247;
		int c=0;
		while(n>0)
		{									// 56247/10 = 6247, 1
											// 5624/10 = 247,   2
											// 562/10 = 47,     3
											// 56/10 = 7,       4
											// 5/10 = 0,      5
			n=n/10;
			c++;
		}
			System.out.println(c);
		

	}

}
