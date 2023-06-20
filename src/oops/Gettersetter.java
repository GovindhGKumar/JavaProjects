package oops;

class worker
{
	private String name;
	private String designation;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

public class Gettersetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
worker w=new worker();
w.setName("Govindh");
w.setDesignation("Tester");
w.setAge(26);
System.out.println(w.getName());
System.out.println(w.getDesignation());
System.out.println(w.getAge());	
	}

}
