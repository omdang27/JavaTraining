package Oops;

class Student {
	int rollno;
	String name;
	static String college = "DAV";

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticVariable {

	public static void main(String[] args) {
		Student s1 = new Student(111, "Peter");
		Student s2 = new Student(222, "James");

		s1.display();
		s2.display();

	}

}
