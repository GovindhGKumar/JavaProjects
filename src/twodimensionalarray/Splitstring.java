package twodimensionalarray;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="selenium webdriver is used for webapplication testing";

String st[]=s1.split(" ");
for(String s2:st)
{
	System.out.println(s2);
	if(s2.contains("webapplication"))
	{	
		break;
	
}
	}

	}
}
