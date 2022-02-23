package MultiThreading;

class Mythread extends Thread {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class SuspendResume {

	public static void main(String[] args) {
		try {

			Mythread t = new Mythread();
			t.start();
			t.suspend();
			Thread.sleep(1000);
     //t.resume();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
