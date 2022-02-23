//4. Write a Java program to find the maximum occurring character in a string. (welocme in Edubridge family)e=>4

package Assignment;

public class MaximumOccuring {

	public static void main(String[] args) {
		String str1 = "test string";
		  System.out.println("The given string is: " + str1);
		  System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
	}
		
		 static final int N = 256;
		 static char MaxOccuringChar(String str1) {
		  int ctr[] = new int[N];
		  int l = str1.length();
		  for (int i = 0; i < l; i++)
		   ctr[str1.charAt(i)]++;
		  int max = -1;
		  char result = ' ';

		  for (int i = 0; i < l; i++) {
		   if (max < ctr[str1.charAt(i)]) {
		    max = ctr[str1.charAt(i)];
		    result = str1.charAt(i);
		   }
		  }

		  return result;
		 }
		 
	}

