package MultiThreading;

class BookThreaterSeat {
	int total_seats = 10;

	synchronized void BookSeat(int seats) {

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

public class Synchronization extends Thread {
	static BookThreaterSeat b;
	int seats;

	public void run() {
		b.BookSeat(seats);

	}

	public static void main(String[] args) {
		b = new BookThreaterSeat();
		Synchronization ajay = new Synchronization();
		ajay.seats = 5;

		ajay.start();

		Synchronization amit = new Synchronization();
		amit.seats = 5;
		amit.start();

	}

}
