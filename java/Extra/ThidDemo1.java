package Extra;


class test
{
	test(ThidDemo1 thidDemo1)
	{
		System.out.println("test class constructor ");
	}
}







public class ThidDemo1 {

	void m1()
	{
		test t = new test(this);
	}
	
	void m2()
	{
	
		m1();
	}
	
	public static void main(String[] args) {
		
		
	ThidDemo1 d = new ThidDemo1();
	d.m1();
	}

}
