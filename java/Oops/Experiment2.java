package Oops;


abstract class gt
{
//	gt()
//	{
//	System.out.println("gt");	
//	}
	abstract void method2();
	
	gt(int a, int b)
	{
		System.out.println(a+" "+b);
		
	}
		
	
}
public class Experiment2 extends gt {
	
	Experiment2(int a, int b) {
		super(a, b);
		
	}

	public static void main(String args[])
	{
	  Experiment2 q= new Experiment2(10,20);
	  q.method2();
	  
	  
		
	}

	@Override
	void method2() {
		System.out.println("gt1212");
		
	}
	
	

}
