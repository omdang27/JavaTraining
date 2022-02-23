package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> pq= new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq.offer(12);
		pq.offer(33);
		pq.offer(45);
		pq.offer(23);
		pq.offer(1);
		pq.offer(26);
		pq.offer(1);
		
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        
        
        System.out.println(pq.peek());
	}

}
