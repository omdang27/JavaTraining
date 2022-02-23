package CollectionFramework;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {
    
	ArrayList<String> obj = new ArrayList<String>();
	obj.add("Vasu");
	obj.add("Sharma");
	
	Collections.sort(obj);
    System.out.println(obj);
	
	ArrayList<Integer> obj2 = new ArrayList<Integer>();
	obj2.add(12);
	obj2.add(455);
	obj2.add(1);
	
	Collections.sort(obj2);
	System.out.println(obj2);
	
	
    Iterator itr = obj.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }

	
	
	
	

	}

}
