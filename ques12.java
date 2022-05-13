/*Create a class “Bank” having method getRateOfInterest(). Create child classes as HDFC, SBI and PNB and override getRateOfInterest() and return interest rates as 4.0, 4.5 and 5% correspondingly.*/

class Bank {
	float getRateOfInterest()
	{
		return 2.02f;
	}
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 4.0f;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 4.5f;
	}
}
class PNB extends Bank
{
	float getRateOfInterest()
	{
		return 5.0f;
	}
}
class empty
{
	public static void main(String args[])
	{
		Bank obj = new HDFC();
		System.out.println(obj.getRateOfInterest());
		obj = new SBI();
		System.out.println(obj.getRateOfInterest());
		obj = new PNB();
		System.out.println(obj.getRateOfInterest());
	}
	
}
