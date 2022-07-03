import java.lang.Thread.*;
import java.util.*;

class Disp {
	public synchronized void wish(String s) {
		System.out.print("Hello : ");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(s);
	}
}

class MyTh extends Thread {
	Disp obj;
	String s;

	MyTh(Disp obj, String s) {
		this.obj = obj;
		this.s = s;
	}

	public void run() {
		obj.wish(s);
	}
}

class Ques23 {
	public static void main(String args[]) {
		Disp obj1 = new Disp();
		Disp obj2 = new Disp();
		MyTh t1 = new MyTh(obj1, "Dikshant");
		MyTh t2 = new MyTh(obj2, "Joshi");
		t1.start();
		try 
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
	}
}