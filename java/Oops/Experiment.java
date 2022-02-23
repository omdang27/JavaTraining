package Oops;


interface Exp
{   int a=10;
	void show();
	static void display()
	{
		System.out.println("display");
	}
	default void get()
	{
		System.out.println("get method of EXP");
	}
	abstract void set();
	
}

interface Exp1 
{
	void show();
	static void display()
	{
		System.out.println("display methiod of exp1");
	}
	default void get()
	{
	System.out.println("get method of exp1");	
	}
	
}

interface Exp3 
{
	void show();
}

class Exp4  implements Exp,Exp1,Exp3
{

	
	@Override
	public void show() {
		System.out.println("hi, this is how method");
		
	}

	@Override
	public void set() {
		System.out.println("set method");
	}

	@Override
	public void get() {
		
		Exp.super.get();
		Exp1.super.get();
		
	}


	

}
public class Experiment {

	public static void main(String[] args) {

	Exp4 obj =new Exp4();
	obj.get();
	
	}
}
