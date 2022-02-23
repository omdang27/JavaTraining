package CollectionFramework;

import java.util.*;

public class Student {
	String name;
	int rollno;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String args[]) {

		Student s1 = new Student("Vasu", 21);
		Student s2 = new Student("Anupam Mittal", 21);
		Student s21 = new Student("Ashneer Grover", 25);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s21);
		al.add(s2);


		
		for(Student s:al)
		{
			System.out.println(s.name);
		}
		
System.out.println("-------------------------------1");
//		Iterator itr = al.iterator();
//		while(itr.hasNext())
//		{
//			
//			System.out.println();
//		}
		
	}

}
