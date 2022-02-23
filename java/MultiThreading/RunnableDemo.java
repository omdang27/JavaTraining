package MultiThreading;

class A1 implements Runnable

{
	public void run() {
		System.out.println("thread a is running");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("a is exited");
	}
}

class B1 implements Runnable {
	public void run() {
		System.out.println("thread b is running");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("b is exited");
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		A1 obj = new A1();
		B1 obj1 = new B1();

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);

		t1.start();
		t2.start();

	}

}
