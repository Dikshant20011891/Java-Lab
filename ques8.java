/* Create a class “Student” having following instance variables and methods.
Instance variables: ID, Name, Branch, city and university
While creating constructors with one, two, three, four and five arguments reuse the constructors by construction chaining */




import java.lang.*;
class Student {
	int id;
	String name;
	String br;
	String Uni;
	String city;
	
	Student(int a)
	{
		this.id = a;
	}
	Student(int a,String b)
	{
		this(a);
		this.name = b;
	}
	Student(int a,String b,String c)
	{
		this(a,b);
		this.br = c;
	}
	Student(int a,String b,String c,String d)
	{
		this(a,b,c);
		this.Uni = d;
	}
	Student(int a,String b, String c, String d, String e)
	{
		this(a,b,c,d);
		this.city = e;
	}
	void showDetails()
	{
		System.out.println("\nId = "+id+"\nName = "+name+"\nBranch = "+br+"\nUniversity = "+Uni+"\nCity = "+city);
	}
	public static void main(String args[])
	{
		Student obj = new Student(101,"Dikshant","Btech Cse","Grphic Era","Dehradun");
		obj.showDetails();
	}
}
