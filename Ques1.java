/*Create a class “Student” having following instance variables and methods.
Instance variables: ID, Name, Branch and university
Method: setDetails() and showDetails().
The setDetails() method sets the values of ID, Name, Branch and University.
And showDetails() method shows the value of each field.*/



import java.lang.*;
class Student {
	int id;
	String name;
	String branch;
	String University;
	
	void setDetails(int a,String b,String c,String d)
	{
		id = a;
		name = b;
		branch = c;
		University = d;
	}
	void showDetails()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Branch = "+branch);
		System.out.println("University = "+University);
	}
	public static void main(String args[])
	{
		Student obj = new Student();
		obj.setDetails(510, "rahul","Btech Cse", "Graphic Era");
		obj.showDetails();
	}
}

