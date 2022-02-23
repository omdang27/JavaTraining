package String;
import java.util.StringTokenizer;
import java.util.*;
public class Token1 {

	public static void main(String[] args) {
		
		  StringBuffer str=new StringBuffer("Object Language");
		    String str2 = new String(str.toString());   
		    int pos = str2.indexOf("Language"); 
		    str.insert(pos,"Oriented"); 
		  
		    System.out.println("Modified String  :"+str); 

	}

}
