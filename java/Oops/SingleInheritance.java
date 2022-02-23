package Oops;

class Semester1 {
	public Semester1() {
		System.out.println("Sem1  constructor     ");
	}

	int math, c, cpp;

	void input() //
	{
		math = 50;
		c = 60;
		cpp = 70;
	}

	public void output() {
		System.out.println("Result of Semester-1  \n\n");
		System.out.println("Marks in Mathematics    " + math);
		System.out.println("Marks in C-language    " + c);
		System.out.println("Marks in  CPP   " + cpp);

		System.out.println("-----------------------------------------------  \n\n");

	}
}

class Semester2 extends Semester1 {
	int java, dbms, eng;

	public Semester2() {
		System.out.println("Sem2  constructor     ");

	}

	public void input2()

	{
		java = 55;
		dbms = 88;
		eng = 65;
	}

	public void output2() {
		System.out.println("Result of Semester-2  \n\n");
		System.out.println("Marks in Java    " + java);
		System.out.println("Marks in DBMS    " + dbms);
		System.out.println("Marks in  English   " + eng);

	}
}

public class SingleInheritance {
	public static void main(String args[]) {
		Semester2 obj = new Semester2();

		obj.input();
		obj.input2();
		obj.output();
		obj.output2();
	}
}