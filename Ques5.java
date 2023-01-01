 /*Re-write program 1 with better memory management approach.*/


import java.lang.*;
class Student {
	int id;
	String name;
	String branch;
	static String University = "Graphic Era Hill University";
	
	void setDetails(int a,String b,String c)
	{
		id = a;
		name = b;
		branch = c;
	}
	void showDetails()
	{
		System.out.println("\nId = "+id);
		System.out.println("Name = "+name);
		System.out.println("Branch = "+branch);
		System.out.println("University = "+University);
	}
	public static void main(String args[])
	{
		Student obj = new Student();
		Student obj2 = new Student();
		obj2.setDetails(101, "Dikshant", "Btech Cse");
		obj.setDetails(510, "rahul","Btech Cse");
		obj.showDetails();
		obj2.showDetails();
		
	}
}
