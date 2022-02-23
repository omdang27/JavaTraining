package MultiThreading;

//Interrupt Method(): ->1. used to interrupt thread
//2. will only works when the thread is in sleeping or waiting state
// if a thread is not is in sleeping state then calling an interrupt method
//will perform normal behavior
//3. it throws an interrupted Exception
//4.Syntax: public void interrupt();
class fgg extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class InterruptMethod extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		InterruptMethod i = new InterruptMethod();
		i.start();
		i.interrupt(); // Works with sleep method

		fgg f = new fgg();
		f.start();
		f.interrupt();
	}

}
