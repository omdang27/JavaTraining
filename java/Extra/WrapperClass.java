package Extra;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		Integer ii=new Integer(i);// boxing
		Integer jj=i;             //autoboxing
		
		int j=jj.intValue(); //unboxing
		int k= jj;           //Autounboxing
		
	}

}
