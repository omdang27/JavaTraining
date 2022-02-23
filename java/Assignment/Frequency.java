//5. Write a Java program to print the frequency of each character in a string (welocme in Edubridge family) like w=1, e=4, l=2 etc.


package Assignment;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s=in.nextLine();
		
		
		s=s.toLowerCase();    
		for(char ch='a';ch<='z';ch++)
		{
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
					c++;
			}
			if(c!=0)
			System.out.println(ch +"\t" +c);
		}
	}

}