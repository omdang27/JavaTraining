package Oops;

class student1 {
	int rollno;
	String name;
	static String college = "ITS";


	static void change() {
		college = "BBDIT";
	}

	student1(int r, String n) {
		rollno = r;
		name = n;
	}


	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticmethod {

	public static void main(String[] args) {
		student1.change();
		
		student1 s1 = new student1(111, "Karan");
		student1 s2 = new student1(222, "Aryan");
		student1 s3 = new student1(333, "Sonoo");

	
		s1.display();
		s2.display();
		s3.display();

	}

}
