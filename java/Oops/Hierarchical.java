package Oops;

class A4 {
	void E() {
		System.out.println("Iam in Class A");
	}
}

class B extends A4 {
	void P() {
		System.out.println("Iam in class B");
	}
}

class C extends A4 {
	void M() {
		System.out.println("Iam in Class C");
	}
}

class Hierarchical {
	public static void main(String args[]) {
		C c = new C();
		c.M();
		c.E();

	}
}