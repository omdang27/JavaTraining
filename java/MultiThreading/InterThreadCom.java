package MultiThreading;

class totalearning extends Thread {
	int total = 0;

	public void run()

	{
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total = total + 100;
			}

			// System.out.println(total);
			this.notify();
		}

	}

}

public class InterThreadCom {

	public static void main(String args[]) throws InterruptedException {
		totalearning e = new totalearning();
		e.start();

		synchronized (e) {
			e.wait();
			System.out.println("totalearnings\n" + e.total);
		}
	}
}
