package Project2;



public class Hare extends Thread {
	static Hare hare;
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Hare" + ": " + i);
			if (i == 60) {
				try {
					sleep(1000);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
