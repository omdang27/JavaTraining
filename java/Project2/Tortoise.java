package Project2;

public class Tortoise extends Thread {
//	static Tortoise tortoise;
	public void run() {
	 
	
		for (int i = 1; i <= 100; i++) 
		{
			System.out.println("Tortoise"+ ": " + i);
			
		}
		System.out.println("tortoise wins");
	}
	
}
