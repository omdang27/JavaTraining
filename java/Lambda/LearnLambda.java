package Lambda;

public class LearnLambda {

	public static void main(String[] args) {

		System.out.println("my system starts");
//		MyInter myinter = new MyInterImpl();
//	myinter.sayHello();

//		MyInter i = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("this is first anonymous class");
//				
//			}
//		};
//		i.sayHello();
//		
//		MyInter i2= new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				// TODO Auto-generated method stub
//				System.out.println("second");
//			}
//		};
//		i2.sayHello();
//		
		// using our interface with the help of lambda
		MyInter i = () -> System.out.println("iam using lambda");

		i.sayHello();

		MyInter i2 = () -> System.out.println("this is second time ");
		i2.sayHello();

		SumInter s = (a, b) -> a + b;

		System.out.println(s.sum(2, 3));

		LengthInter lengthInter = (str) -> str.length();
		System.out.println("length of the string " + lengthInter.getlength("vasu"));

		Mulinter m = (a, b) -> a * b;
		System.out.println("multiply" + m.Mul(2, 3));

	}
}
