package ControlStatement;

public class Break {

	public static void main(String[] args) {
		 int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 40 ) {
	            break;
	         }
	         System.out.print( x );
	         System.out.print("\n");

	}

}
}
