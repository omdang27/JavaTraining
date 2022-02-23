//3. Write a program that takes as input the size of the array and  
//the elements in the array. The program then asks the user to enter
//a particular index and prints the element at that index. 
//Index  starts from zero. 







package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in an array");
	
		
			int n =sc.nextInt();
		
		
		int arr[]= new int[n];
		 System.out.println("enter the elements in an array");
	try {
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
			 
		 }
		 
		 
		 System.out.println("enter the index you want to access");
		 int b=sc.nextInt();
		 
		System.out.println("The array element at index "+ b +" is"+arr[b]);
		System.out.println("The array element successfully accessed");
	
	}
	catch(ArrayIndexOutOfBoundsException e)
    {
		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
      
    }
	catch (NumberFormatException e)
	{
		System.out.println("java.lang.NumberFormatException");
	}
	catch(InputMismatchException e)
{
		System.out.println("java.lang.InputMismatchException");
	}
	}

}
