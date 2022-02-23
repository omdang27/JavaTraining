// 5.Write a Program with a division method who receives two integer numbers and  
//performs the division operation. The method should declare that it throws 
//ArithmeticException. This exception should be handled in the main method.







package ExceptionHandling;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try{
			double r = division(a, b);
			System.out.println(r);
		} 
	catch (ArithmeticException e) {
		System.out.println("exception");
		}

	}
		public static double division(int a, int b) throws ArithmeticException{
		return a / b;
			
	}

}
