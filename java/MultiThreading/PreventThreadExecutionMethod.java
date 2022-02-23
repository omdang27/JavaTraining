package MultiThreading;

public class PreventThreadExecutionMethod extends Thread {
	public void run() {
//	   Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

	public static void main(String[] args) {
		// java 5-> yield method internally uses sleep() method
		// java6-> thread provides the hint to thread scheduler,then it depend
		// on thread scheduler to accept or ignore the hint.
		// Method syntax: public static native void yield();

		PreventThreadExecutionMethod t = new PreventThreadExecutionMethod();
		t.start();

		Thread.yield();
		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
