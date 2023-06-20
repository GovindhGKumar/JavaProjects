package stringoperators;

public class Operatorssample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HI";
		String s1="   Welcome  back   ";
		String s2="How are you";
		
		System.out.println(s+" "+s2);				//concate
		System.out.println(s.equals(s2));			//.equals
		System.out.println(s2.contains("are"));		//contains()
		System.out.println(s2.toUpperCase());		//toUpperCase()
		System.out.println(s.toLowerCase());		//toLowerCase()
		System.out.println(s.length());				//length()
		System.out.println(s2.startsWith("How"));	//startsWith()
		System.out.println(s2.endsWith("You"));		//endsWith()
		System.out.println(s1.trim());				//trim()
		System.out.println(s2.substring(2,5));		//substring()
		System.out.println(s2.charAt(3));			//charAt()
		
		String[]sr=s2.split(" ");					//split()
		for(String v:sr)
		{
			System.out.println(v);

		}

		




		
		




	}

}
