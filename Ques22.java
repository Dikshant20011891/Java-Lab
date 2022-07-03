class Display {
	public synchronized void wish(String name) {
		System.out.print("Hello ");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class Ques22
{
	public static void main(String args[])
	{
		Display d= new Display();
		MyThread t1=new MyThread(d,"Dikshant");
		t1.start();
		MyThread t2=new MyThread(d,"Joshi");
		t2.start();
	}
}
