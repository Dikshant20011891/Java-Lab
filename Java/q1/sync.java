/* synchronization in thread

can be solved using 
public synchronized wish(String s)

*/
import java.util.*;

class Disp
{
	public void wish(String s)
	{                                                                                   
		for(int i=0;i<2;i++)
		{
			System.out.print("Hello : ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(s);
		}
	}
}

class MyThread extends Thread
{
	Disp obj;
	String s;
	MyThread(Disp obj,String s)
	{
		this.obj = obj;
		this.s = s;
	}
	public void run()
	{
		obj.wish(s);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Disp obj = new Disp();
		MyThread t1 = new MyThread(obj,"Raj");
		t1.start();
		MyThread t2 = new MyThread(obj,"Ravi");
		t2.start();
	}
}

