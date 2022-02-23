//1. Write a Java program to compare two strings lexicographically, ignoring case differences2.


package Assignment;

public class Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is exercise 1";
        String str2 = "This is Exercise 2";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
   
        int result = str1.compareToIgnoreCase(str2);
      
     
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else 
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }

	}


