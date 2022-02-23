package Extra;

class A extends Thread {

	public void run() {
		
		try {
			  waitdemo d = new waitdemo();
			d.join();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("childclass"+i);
		
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

public class waitdemo extends Thread {

	public static void main(String[] args) throws InterruptedException {

	   waitdemo d = new waitdemo();
	   A a= new A();
	   a.start();
	   
	   	for (int i = 1; i <= 5; i++) {
			System.out.println("main class" + i);
		}
		

	}
}