package String;

import java.util.*;

public class StringjoinerDemo {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",");

		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");
		System.out.println(joinNames);

		StringJoiner joinNames1 = new StringJoiner(",", "[", "]");

		joinNames1.add("Rahul");
		joinNames1.add("Raju");
		joinNames1.add("Peter");
		joinNames1.add("Raheem");
		System.out.println(joinNames1);

		StringJoiner joinNames3 = new StringJoiner(",", "[", "]");

		joinNames3.add("Rahul");
		joinNames3.add("Raju");

		StringJoiner joinNames4 = new StringJoiner(":", "#", "#");

		joinNames4.add("Peter");
		joinNames4.add("Raheem");
		StringJoiner merge = joinNames3.merge(joinNames4);
		System.out.println(merge);

	}

}
