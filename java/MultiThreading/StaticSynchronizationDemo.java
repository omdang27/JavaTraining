package MultiThreading;

class BookThreaterSeat3 {
	static int total_seats = 10;

	static synchronized void BookSeat(int seats) {

		if (total_seats >= seats) {
			System.out.println("Seats Booked Successfully");
			total_seats = total_seats - seats;
			System.out.println("Left seats " + total_seats);
		} else {
			System.out.println("Sorry!! ,Seats Cannot Be Booked");
			System.out.println("seats left " + total_seats);
		}

	}
}

class MyThread1 extends Thread {
	BookThreaterSeat3 h;
	int seats;

	MyThread1(BookThreaterSeat3 h, int seats) {
		this.h = h;
		this.seats = seats;
	}

	public void run() {
		h.BookSeat(seats);
	}
}

class Mythread2 extends Thread {
	BookThreaterSeat3 h;
	int seats;

	Mythread2(BookThreaterSeat3 h, int seats) {

		this.h = h;
		this.seats = seats;
	}

	public void run() {
		h.BookSeat(seats);
	}
}

public class StaticSynchronizationDemo extends Thread {

	public static void main(String[] args) {
		BookThreaterSeat3 b3 = new BookThreaterSeat3();
		MyThread1 t1 = new MyThread1(b3, 7);
		t1.start();

		Mythread2 t2 = new Mythread2(b3, 2);
		t2.start();

		BookThreaterSeat3 b4 = new BookThreaterSeat3();
		MyThread1 t3 = new MyThread1(b4, 1);
		t3.start();

		Mythread2 t4 = new Mythread2(b4, 2);
		t4.start();

	}

}
