/*Create class Employee with following attributes and methods
ID, name, department and salary.
The setDetails() method sets the values of ID, name, department and salary.
And showDetails() method shows the value of each field.*/


import java.util.Scanner;

class Employee {
	int id;
	String name;
	String dep;
	int sal;
	
	Employee()
	{
		this.id = 101;
		this.name = "Mayank";
		this.dep = "Computer";
		this.sal = 40000;
	}
	
	void setDetails(int a,String b,String c,int d)
	{
		this.id = a;
		this.name = b;
		this.dep = c;
		this.sal = d;
	}
	
	void showDetails()
	{
		System.out.println("\nId = "+id+"\nName = "+name+"\ndepartment = "+dep+"\nSalary = "+sal);
	}
	
	public static void main(String args[])
	{
		Employee obj = new Employee();
		Employee obj2 = new Employee();
		int a,d;
		String c,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.next();
		c = sc.next();
		d = sc.nextInt();
		obj2.setDetails(a,b,c,d);
		obj.showDetails();
		obj2.showDetails();
	}
}
