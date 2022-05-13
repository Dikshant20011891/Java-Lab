/*Write a Java Program to demonstrate the working of a banking-system  
Instance variables: name, account_no, amount  
Instance methods:  deposit(), withdraw(), checkBalance(), insert() and display().
Here we can deposit and withdraw amount from our account using deposit() and withdraw() methods respectively.*/


import java.lang.*;
class Bank {
	String name;
	int account_no;
	int amount;
	
	void insert(String a,int b,int c)
	{
		name = a;
		account_no = b;
		amount = c;
	}
	void display()
	{
		System.out.println("Name = "+name+”\nAccount No. = "+account_no+”\n Amount = "+amount);
	}
	void withdraw(int a)
	{
		if(a>amount)
			System.out.println("Insufficient Balance");
		else
		{
			amount -= a;
			System.out.println("Remaining Balance = "+amount);
		}
	}
	void deposit(int a)
	{
		amount += a;
		System.out.println("New Balance = "+amount);
	}
	public static void main(String args[])
	{
		Bank obj = new Bank();
		obj.insert("Dikshant",20011891,9000);
		obj.display();
		obj.withdraw(4000);
		obj.deposit(5000);   
    }
