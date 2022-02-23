//6. Wap to check string is palindrome or not like “madam”

package Assignment;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
    String str,rev="";
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any text to check if its palindrome or not");
    str=sc.nextLine();
    int length=str.length();
     
     for(int i=length-1;i>=0;i--)
     {
    	 rev=rev+str.charAt(i);
     }
     if(str.equals(rev))
     {
    	 System.out.println("palindrome");
    	 
     }
     else
    	 
     {
    	 System.out.println("not a palindrome");
     }
	}
}

