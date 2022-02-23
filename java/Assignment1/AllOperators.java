package Assignment1;

public class AllOperators {

	public static void main(String[] args) {
		// Arithmatic Operators
		int a=10;
		int b=20;
		int sum= a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem= 10%20;
		System.out.println("Sum of a and b "+sum);
		System.out.println("Subtraction of a and b "+sub);
		System.out.println("Multiplication of a and b "+mul);
		System.out.println("Division of a and b "+div);
		System.out.println("Modulus of a and b "+rem); 
		
		
		//Assignment operators
		
		int X=12, Y=13, Z=16;
		 System.out.println("The Assignment Value is : ");
		X+=2;
		Y-=2; 
		Z*=2; 
		System.out.println("The Value of X is : " +X); 
		System.out.println("The Value of Y is : " +Y); 
		System.out.println("The Value of Z is : " +Z); 

		
		//Bitwise Operators
		
		 int l = 5;
		 int m = 7;

		 // bitwise and
		 // 0101 & 0111=0101 = 5
		 System.out.println("l&m = " + (l & m));

		 // bitwise or
		 // 0101 | 0111=0111 = 7
		 System.out.println("l|m = " + (l | m));

		 // bitwise xor
		 // 0101 ^ 0111=0010 = 2
		 System.out.println("l^m = " + (l ^ m)); 
		// bitwise and
		 // ~0101=1010
		 // will give 2's complement of 1010 = -6

		 System.out.println("~l = " + ~l);

		 // can also be combined with
		 // assignment operator to provide shorthand
		 // assignment
		 // l=l&m

		 l &= m;
		 System.out.println("a= " + l); 

		 //Increment Operator
		 
		 int q=40;
		 int w=50;
		 System.out.println("Value of q "+q);
		 System.out.println("Value of w "+w);

		 System.out.println("Value of --q "+(--q));
		 System.out.println("Value of q "+q);
		 System.out.println("Value of w-- "+(w--));
		 System.out.println("Value of w "+w);
		 
		 
		 
		 //Logical Operator
		 
			boolean t = true;
			 boolean y = false;
			 System.out.println("t && y = " + (t&&y)); // false
			 System.out.println("t || y = " + (t||y) ); // true
			 System.out.println("!(t && y) = " + !(t && y)); // true
		 
			 
			 //Relational Operator
			 int g = 10;
			 int h = 20;
			 System.out.println("g == h = " + (g == h) ); // false
			 System.out.println("g != h = " + (g != h) ); // true
			 System.out.println("g > h = " + (g > h) ); // false
			 System.out.println("g < h = " + (g < h) ); //true
			 System.out.println("h >= g = " + (h >= g) ); // true
			 System.out.println("h <= g = " + (h <= g) ); // false

		//Ternary Operator
			 int i=2;
				int o=5;
				int min=(i<o)?i:o;
				 System.out.println(min);
		 
		 
	}

}
