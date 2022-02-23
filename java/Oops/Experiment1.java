package Oops;



class Exp2 {
	public Exp2(){
		System.out.println("this is constructor");  
	}
	public Exp2(int a) {
		System.out.println("this is constructor,"+a);
	}
	public void run() {
		System.out.println("process is running");
	}
	
}



class Experiment1 extends Exp2 {
	public Experiment1(int x, int y) {
	super(30);
		System.out.println(x+ "this is Constructor" +y);
	}
	Experiment1(){
		System.out.println("hello");
	}
	public void run() {
		super.run();   
		System.out.println("process running");
	}

	public static void main(String[] args) {
		Experiment1 d = new Experiment1(10,20);
		//Exp2 obj=new Exp2(50);
		d.run();
    }

}