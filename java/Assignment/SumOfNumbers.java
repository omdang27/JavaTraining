//9.. Write a Java program to calculate the sum of the numbers appear in a given string.


package Assignment;

public class SumOfNumbers {

	public int sumOfTheNumbers(String stng) 
	{
	  int l = stng.length();
	  int sum = 0;
	  String temp = "";
	  for (int i = 0; i < l; i++) 
	  {
	    if (Character.isDigit(stng.charAt(i))) 
		{
	      if (i < l-1 && Character.isDigit(stng.charAt(i+1))) 
		  {
	        temp += stng.charAt(i);
	      }
	      else 
		  {
	        temp += stng.charAt(i);
	        sum += Integer.parseInt(temp);
	        temp = "";
	      }
	    }
	  }
	  return sum;
	}
	public static void main (String[] args)
    {
     SumOfNumbers m= new SumOfNumbers();
      String str1 =  "sdfbuwsbfjk545jksdbfjwsbf555jksdnjdk55";
      System.out.println("The given string is: "+str1);
      System.out.println("The sum of numbers in the string is: "+m.sumOfTheNumbers(str1));
	  }
}
	
	
