package CollectionFramework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> students= new Stack<String>();
		students.push("Rajeev");
		students.push("Ajay");
		students.push("Sood");
		students.push("Rohan");
		System.out.println(students);
		System.out.println(students.peek());
		System.out.println(students.pop());
		System.out.println(students);
		System.out.println(students.peek());
	}

}
