// 6.Write a Program to take care of Number Format Exception if user enters values
//other than integer for calculating average marks of 2 students. The name of the 
//students and marks in 3 subjects are taken from the user while executing the 
//program. In the same Program write your own Exception classes to take care of 
//Negative values and values out of range (i.e. other than in the range of 0-100) 


package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;



class NegativeValue extends Exception
{
	public NegativeValue(String msg)
	{
		super(msg);
	}
}

class ValueOutOfRange extends Exception
{
	public ValueOutOfRange(String msg)
	{
		super(msg);
	}
}

public class Questions6 {
	
	public void original() throws NegativeValue,ValueOutOfRange
	{     Scanner s=new Scanner(System.in);
		 int arr[]=new int[20];
		 int sum=0;
		 float avg;
		try {
		for(int i=1;i<4;i++)
		{
		 System.out.println("enter marks of subject "+i);
		 arr[i]=s.nextInt();
		  sum = sum + arr[i];
		  if(arr[i]<0) {
		  NegativeValue n=new NegativeValue("negative");
				  throw n;
	     }
		  else if(arr[i]>100)
		  {
			  ValueOutOfRange v=new ValueOutOfRange("out");
			  throw v;
		  }
		 
		}
		
		  System.out.println("Sum:"+sum);
	        avg = (float)sum / 3;
	        System.out.println("Average:"+avg);
		
	}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		} 
	}
	

	public static void main(String[] args) {
		System.out.println("enter name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		Questions6 obj=new Questions6();
		try {
			obj.original();
		} catch (NegativeValue e) {
			
			e.printStackTrace();
		} catch (ValueOutOfRange e) {
			
			e.printStackTrace();
		}
		System.out.println("enter name of second student");
		String name1=sc.nextLine();
		Questions6 obj1=new Questions6();
		try {
			obj1.original();
		} catch (NegativeValue e) {
			
			e.printStackTrace();
		} catch (ValueOutOfRange e) {
			
			e.printStackTrace();
		}

	}

}
