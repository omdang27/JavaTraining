package MultiThreading;

public class Naming extends Thread{
	
	
	public void run()
	{
		System.out.println("Thread Task");
//		System.out.println(Thread.currentThread().isAlive());  
	}
	
	
	
	
	
	public static void main (String args[]) throws InterruptedException 
	{
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());  
		Thread.currentThread().setName("vasu");
	System.out.println(Thread.currentThread().getName());  
		System.out.println(10/0);
//		
//		Naming n=new Naming();
//		n.start();
//		System.out.println(Thread.currentThread().isAlive());
//		System.out.println(n.isAlive());
	}

}
