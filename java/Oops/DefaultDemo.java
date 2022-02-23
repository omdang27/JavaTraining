package Oops;

interface Sayable {

	default void say() {
		System.out.println("Hello, this is default method");
	}

	void sayMore(String msg);
	
    static void abs()
    {
    	System.out.println("static");
    }
    abstract void anm();
  
    
    
    
}




public class DefaultDemo implements Sayable
{
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	@Override
	public void say() {
		System.out.println("Hello, this is default method1");
	}
	
	  void abs()
	    {
	    	System.out.println("static1");
	    }

	public static void main(String[] args) {
		DefaultDemo dm = new DefaultDemo();
	//	dm.say();
	
	//	dm.sayMore("Work is worship");
     //	Sayable.abs();
        dm.anm();
	}

	@Override
	public void anm() {
		System.out.println("abstarct");
		
		
		}
	}
