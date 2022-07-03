class A extends Thread
{
    public void run()
   {
        for(int i=1;i<=10;i++) 
        {
            System.out.print("From A: "+i);
        }
    }
}
class B extends Thread
{
    public void run() 
    {
        for(int i=1;i<=10;i++) 
        {
            System.out.println("From B: "+i);
        } 
        
    }
} 
class C extends Thread 
{
	public void run()
    {
		for(int i=1;i<=10;i++)
        {
			System.out.println("From C: "+i);
		} 
		
	}
}

class Ques21
{
    public static void main(String args[])
    {
        A t1=new A();
        B t2=new B(); 
        C t3=new C();

        System.out.println("Thread A Name: "+t1.getName());
        System.out.println("Thread B Name: "+t2.getName()); 
        System.out.println("Thread C Name: "+t3.getName()+"\n"); 

        t1.setName("First");
        t2.setName("Second");  
        t3.setName("Third");
        System.out.println("Thread A New Name : "+t1.getName());
        System.out.println("Thread B New Name : "+t2.getName());  
        System.out.println("Thread C New Name : "+t3.getName()+"\n");  


        System.out.println("Thread A Priority: "+t1.getPriority());
        System.out.println("Thread B Priority: "+t2.getPriority());  
        System.out.println("Thread C Priority: "+t3.getPriority()+"\n");

        t1.setPriority(2);
        t2.setPriority(6);  
        t2.setPriority(9);
        
        System.out.println("Thread A New Priority : "+t1.getPriority());
        System.out.println("Thread B New Priority : "+t2.getPriority());  
        System.out.println("Thread C New Priority : "+t3.getPriority()+"\n");  
    }
}
