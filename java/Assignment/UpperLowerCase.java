//2. Write a java program to convert given string in lower and uppercase


package Assignment;
import java.util.Scanner;
public class UpperLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string to be converted to UpperCase");
		 String str = sc.nextLine();
		 
		 str = str.toUpperCase();  
		 System.out.println("String on using toUpperCase() method = "+str);
		 
		 
		 Scanner sc1 = new Scanner(System.in);
		 System.out.println("Enter the string to be converted to LowerCase");
         String str1=sc1.nextLine();
         
         str1=str1.toLowerCase();
         System.out.println("String on using toLowerCase() method = "+str1);
	}

}
