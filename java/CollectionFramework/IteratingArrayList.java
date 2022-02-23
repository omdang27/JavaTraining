package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Vasu");
		obj.add("Sharma");
		obj.add("Himachal");
		
		System.out.println(obj);
		
//Traversing through for loop
		for(int i =0;i<obj.size();i++)

		{
			System.out.println(obj.get(i));
		}
		
		System.out.println("-------------------------1");
		
//Traversing using Iterator
		
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------------------------2");
	
//Iterating elements in reverse order by list iterator
		
	 ListIterator itr1 = obj.listIterator(obj.size());
	 while(itr1.hasPrevious())
	 {
		 System.out.println(itr1.previous());
	 }
		
		
		
		System.out.println("-------------------------3");
//Using for Each Loop
		
		for(String s:obj)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------4");


//Using for each method
		obj.forEach(a->{
			System.out.println(a);
		});
System.out.println("-------------------------5");


//Using for each remaining method
		Iterator itr3= obj.iterator();
		itr3.forEachRemaining(a->{
			System.out.println(a);
		});
		
		

}
}
