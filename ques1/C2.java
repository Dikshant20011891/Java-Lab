package P2;
import P1.*;
import java.util.*;

class C2 implements I1
{
	public int mult(int a,int b)
	{
		return a*b;
	}
	public static void main(String args[])
	{
		C1 obj = new C1();
		System.out.println("C1 Sum = "+obj.sum(3,7));
		System.out.println("C1 Div = "+obj.div(9,3));
		
		C2 obj2 = new C2();
		System.out.println("Interface Mult = "+obj2.mult(10,2));
	}
}

			
