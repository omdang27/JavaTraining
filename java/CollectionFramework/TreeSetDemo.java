package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(25);
		set.add(56);
		set.add(256);
		set.add(1000);
		set.add(89);
		set.add(89);
		System.out.println(set);
		set.remove(56);
		System.out.println(set);

		System.out.println(set.contains(1000));

		System.out.println(set.isEmpty());

		System.out.println(set.size());

		set.clear();

		System.out.println(set);

	}

}
