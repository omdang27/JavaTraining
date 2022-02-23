//4. Write a class MathOperation which accepts integers from command line.
//Create an array using these parameters. Loop through the array and obtain the 
//sum and average of all the elements.  Display the result.  Check for various
//exceptions that may arise like ArithmeticException, NumberFormatException, and 
//so on. For example: The class would be invoked as follows:
//C:>java MathOperation 1900, 4560, 0, 32500 

package ExceptionHandling;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Questions4 {

	public static void main(String[] args) {
		int n, sum = 0;
        float average;

        System.out.print("Enter no. of elements you want in array:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        try {
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
        }
        catch (InputMismatchException e) {
		  System.out.println("exception");
		}
        catch(NumberFormatException e)
		{
			System.out.println(e);
		}
    
	}

}
