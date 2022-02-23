package Oops;

class Animal {
	void Wild() {
		System.out.println("123");
	}
}
 
class Dog extends Animal {
   void Wild()
  {
	System.out.println("90");
	super.Wild();                 //super keyword
	 }
}

class Cat extends Animal {
	void Wild() {
		System.out.println("345");
	}
}

class Horse extends Animal {
	void Wild() {
	System.out.println("678");
	}
}
  
class MethodOverriding {
	public static void main(String args[]) {
		Dog s = new Dog();
	    s.Wild();
	}
}
