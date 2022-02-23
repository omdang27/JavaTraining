//8.Write a program to accept name and age of a person from the command prompt
//(passed as arguments when you execute the class) and ensure that the age 
//entered is >=18 and < 60.  Display proper error messages. 
//The program must exit gracefully after displaying the error message in case 
//the arguments passed are not proper. 



package ExceptionHandling;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();

		try {

			if (age < 18 || age >= 60)

				throw new InvalidAgeException("Invalid Age");
			else
			System.out.println("Name: " + name + " Age: " + age);

		} catch (InvalidAgeException e) {

			System.out.println(e);
		}

	}

}

class InvalidAgeException extends Exception {

	public InvalidAgeException(String age) {

		super(age);

	}

}
