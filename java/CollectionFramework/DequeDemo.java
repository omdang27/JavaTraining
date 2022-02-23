package CollectionFramework;

import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq= new ArrayDeque<Integer>();
	    adq.offer(23);
	    adq.offer(321332);
	    adq.offerLast(56);
	    adq.offer(12);
	    adq.offer(15335);

	    
	    System.out.println(adq);
	    
	    
	    System.out.println(adq.poll());
	    System.out.println(adq);
	    
	    System.out.println(adq.pollLast());
	    System.out.println(adq);
		

	}

}
