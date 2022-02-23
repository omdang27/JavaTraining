package Extra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Employee {
	public static void main(String args[]) throws IOException
	{
		InputStreamReader file=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(file);
	    System.out.println("Enter your name");
		String Str= br.readLine();
	    System.out.println("Enter your age");
        int i= Integer.parseInt(br.readLine());
        System.out.println("Enter your id");
        int t=Integer.parseInt(br.readLine());
        Employe std= new Employe(Str , i , t);
        std.show();
	}
}
	class Employe
	{
		String Str;
		int i,t;
	 Employe(String Str,int i,int t)
	 {
		 this.Str=Str;
		 this.i=i;
		 this.t=t;
      }
	
	
	void  show()
	{
	System.out.println("name is"+this.Str);
	System.out.println("age is"+this.i);
	System.out.println("id is"+this.t);
    	
	}

}

