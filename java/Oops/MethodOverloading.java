package Oops;

//Method Overloading by changing number of parameters

 public class MethodOverloading {
	private static void display(int a) {
		System.out.println("Arguments: " + a);
	}

	private static void display(int a, int b) {
		System.out.println("Arguments: " + a + " and " + b);
	}

	public static void main(String[] args) {
		MethodOverloading.display(1);
		MethodOverloading.display(1, 4);
	}
}

//Method Overloading by changing the data type of parameters
//class MethodOverloading {
//
//   
//    private static void display(int a){
//        System.out.println(" Integer data.");
//    }
//
//    
//    private static void display(String a){
//        System.out.println(" String object.");
//    }
//
//    public static void main(String[] args) {
//        display(1);
//        display("Hello");
//    }
// }