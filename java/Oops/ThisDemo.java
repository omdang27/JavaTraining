package Oops;
import java.util.*;




public class ThisDemo {
	  int x=30;

 
	  public ThisDemo(int x) {
		 
	 this.x = x;
	 System.out.println(x);
	  }
   void run()
   {
	   System.out.println(x);
   }
   void sun()
   {
	   System.out.println(x+x);
   }
   
public static void main(String[] args) {
	    ThisDemo myObj = new ThisDemo(20);
	     System.out.println(myObj.x);
	    myObj.run();
	    myObj.sun();
	   
	  }
	  }