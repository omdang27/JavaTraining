package MultiThreading;

import java.lang.*;

//if a thread wants to wait for another thread to complete its task then we should use join() method. 
//overloaded method
//public final void join() throws InterruptedException
//public final synchronized void join(long ms) throws InterruptedException
//public final synchronized void join(long ms,int ns) throws InterruptedException
public class JoinMethod extends Thread {
	static Thread t;
	public void run() {
      
		try {
		      t.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread" + i);
				Thread.sleep(1000);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws InterruptedException {
	 t = Thread.currentThread();
		JoinMethod j = new JoinMethod();
		j.start();
//      j.join();
		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread" + i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
