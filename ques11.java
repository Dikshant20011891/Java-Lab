/*Create a class “Shape” having area() method to calculate area. Overload the area() method for shapes like triangle, rectangle and circle*/


public class Shape {
	void area(float b,float h)
	{
		System.out.println("Triangle Area = "+0.5*b*h);
	}
	void area(int l,int b)
	{
		System.out.println("Rectangle Area = "+l*b);
	}
	void area(float a)
	{
		System.out.println("Circle Area = "+(3.14*a*a));
	}
	
	public static void main(String args[])
	{
		Shape obj = new Shape();
		obj.area(3.3f);
		obj.area(4,6);
		obj.area(4.2f,1.2f);
	}
}
