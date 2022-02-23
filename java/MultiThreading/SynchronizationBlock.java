package MultiThreading;

class BookThreaterSeat1
{
	int total_seats=10;
	
 void BookSeat(int seats)
	{  
        
	 synchronized(this)
	 {
	 
	 
  
		if(total_seats>=seats)
		{
		System.out.println("Seats Booked Successfully");
		total_seats=total_seats-seats;
		System.out.println("Left seats "+total_seats);
		}
		else
		{
			System.out.println("Sorry!! ,Seats Cannot Be Booked");
			System.out.println("seats left "+ total_seats);
		}
	 }
	}
}



public class SynchronizationBlock extends Thread{
   static BookThreaterSeat b;
   int seats;
	public void run()
  {
		b.BookSeat(seats);

  }

	public static void main(String[] args) {
	b= new BookThreaterSeat();
	SynchronizationBlock ajay = new SynchronizationBlock();
	ajay.seats=5;

	ajay.start();
	
	SynchronizationBlock amit = new SynchronizationBlock();
	amit.seats=5;
	amit.start();
	
	
	

	}

}
