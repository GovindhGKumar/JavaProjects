package oops;
class members
{
	String name;
	int age;
	String phoneno;
	String address;
	int salary;
	public void print()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
	
}

class Employee extends members
{
	String specialisation;
	public void print1()
	{
	System.out.println("Tester");
}
}

class manager extends members
{
	String department;
	public void print2()
	{
		System.out.println("IT");
	}
}

public class Inheritenceprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee e=new Employee();
	manager m=new manager();
	e.print1();
	e.name="arun";
	e.age=14;
	e.phoneno="24587954";
	e.address="khy";
	e.salary=25000;
	
	e.print();
	
	
	m.print2();
	m.name="rahul";
	m.age=25;
	m.phoneno="567894";
	m.address="jhy";
	m.salary=21000;
	
	m.print();
	
	}
}


