package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;







public class Question3 {
	
	public static void printall(List<String> l)
	{
		Iterator<String> it =l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList();
		l.add("vasu");
		l.add("sharma");
		
		printall(l);
		
		
		
		
		

	}

}
