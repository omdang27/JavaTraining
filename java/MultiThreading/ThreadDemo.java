package MultiThreading;

class A extends Thread {
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

class B extends Thread {
	public void run() {
		System.out.println("thread b is running");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("b is exited");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		A obj = new A();
		obj.start();

	}

}
