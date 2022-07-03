class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("From A: "+i);
		}
	}
}
class B extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("From B: "+i);
		} 
		
	}
} 
class C extends Thread 
{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("From C: "+i);
		} 
	}
}
class Ques20
{
	public static void main(String args[]){
		A obj1=new A();
		B obj2=new B(); 
		C obj3=new C();
		obj1.start();
		obj2.start(); 
		obj3.start();
	}
}
