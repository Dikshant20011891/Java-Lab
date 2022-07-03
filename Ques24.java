import java.util.*;

class Customer {
	int bal = 100;

	public synchronized void withdraw(int amt) {
		System.out.println("Withdrawal Initiated");
		if (amt > bal) {
			try {
				System.out.println("Please Wait");
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		bal -= amt;
		System.out.println("Withdraw SuccessFull\nNew Balance = " + bal);
	}

	public synchronized void deposit(int amt) {
		System.out.println("Deposit Initiated");
		bal += amt;
		System.out.println("Deposit SuccessFull\nNew Balance = " + bal);
		notify();
	}
}

class Mythread1 extends Thread {

	Customer c;

	Mythread1(Customer c) {
		this.c = c;
	}

	public void run() {
		c.withdraw(150);
	}
}

class Mythread2 extends Thread {

	Customer c;

	Mythread2(Customer c) {
		this.c = c;
	}

	public void run() {
		c.deposit(100);
	}
}

class Ques24 {
	public static void main(String args[]) {
		Customer c = new Customer();
		Mythread1 t1 = new Mythread1(c);
		t1.start();
		Mythread2 t2 = new Mythread2(c);
		t2.start();
	}
}