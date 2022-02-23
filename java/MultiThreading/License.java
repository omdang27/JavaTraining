package MultiThreading;

class Medical extends Thread {
	public void run() {
		try {
			System.out.println("Medical Starts");
			Thread.sleep(5000);
			System.out.println("Medical Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Testdriver extends Thread {
	public void run() {
		try {
			System.out.println("Test Drive Starts");
			Thread.sleep(5000);
			System.out.println("Test Drive completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread {
	public void run() {
		try {
			System.out.println("Officer takes the file");
			Thread.sleep(5000);
			System.out.println("officer works completed");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

public class License {

	public static void main(String[] args) throws InterruptedException {
		Medical medical = new Medical();
		medical.start();

		medical.join();
		Testdriver t = new Testdriver();
		t.start();

		t.join();
		OfficerSign o = new OfficerSign();
		o.start();

	}

}
