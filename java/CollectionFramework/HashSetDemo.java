package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(25);
		set.add(56);
		set.add(256);
		set.add(1000);
		set.add(89);
		set.add(89);
		System.out.println(set);
         set.remove(56);
         System.out.println(set);
         
         
        System.out.println( set.contains(1000));
         
        System.out.println(set.isEmpty());
        
        System.out.println(set.size());
		
        set.clear();
        
        System.out.println(set);
        
	}

}
