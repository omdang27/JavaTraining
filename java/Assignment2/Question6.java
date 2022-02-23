package Assignment2;


import java.util.LinkedList;
import java.util.List;

public class Question6 {
	
	//List<Integer> list = new LinkedList()<Integer>();
	List<Integer> list = new LinkedList<Integer>();
	LinkedList<Integer>saveEvenNumber (int N)
	{
		for(int i =0;i<=N;i++)
		{
			if(i%2==0)
		  list.add(i);
		}
		System.out.println(list);
		return null;
	
		
	}
	
	LinkedList<Integer> printEvenNumber()
	 {
		 LinkedList<Integer> list1= new LinkedList<Integer>();
		 for(int item:list)
		 {
			 list1.add(item*2);
			 System.out.println(item*2);
			 
		 }
		 
		 
		 
		return null;
	 }	
		
LinkedList<Integer>printevenNumber(int N)
	{
		
		System.out.println("-----------");
		boolean ans=list.contains(N);
		if(ans){
		System.out.println(N);	
		}
		else {
			System.out.println("Zero");
		}
		return null;
		
			
		
	}
	

	public static void main(String[] args) {
		Question1 asd= new Question1();
		 asd.saveEvenNumber(10);
		 asd.printEvenNumber();
		 asd.printevenNumber(3);

	}

}
