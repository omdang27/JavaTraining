package String;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		// string buffer constructors
		
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity()); // stores 16 characters
		
		
		StringBuffer ab= new StringBuffer("deepak");
		System.out.println(ab.capacity());      //16+6=22
       
		
		StringBuffer jb= new StringBuffer(1000);
		System.out.println(jb.capacity());
		
		
		
		StringBuffer tb= new StringBuffer();
		tb.append("hello");
		System.out.println(tb.capacity());    //16
		tb.append("javaaaaaaaaaaaaa");
		System.out.println(tb.capacity());     //(16*2)+2
		
		//length Method
		
		StringBuffer eb= new StringBuffer("Vasu");
		System.out.println(eb.length());
		
		//append Method
		
		StringBuffer fg= new StringBuffer("hi");
		System.out.println(fg.append("java"));
		
		//delete Method
		
		StringBuffer b= new StringBuffer("core Java");
		System.out.println(b.delete(2, 5));

	    //deleteCharAt
		
		StringBuffer t= new StringBuffer("Technology");
		System.out.println(t.deleteCharAt(4));
		
		//StringBuffer class does not override equals method of Object class
		//but String Class override the equals method of object class
		StringBuffer c= new StringBuffer("core Java");
		StringBuffer d = new StringBuffer("core Java");
	    System.out.println(c.equals(d));
	    
	    StringBuffer r= new StringBuffer("core Java");
	    StringBuffer l= r.append("hi");
	    System.out.println(r.equals(l));
	    
	    //reverse
	    StringBuffer e= new StringBuffer("core Java");
	    System.out.println(e.reverse());
	    
	    //subsequence
	    StringBuffer q= new StringBuffer("core Java");
	    System.out.println(q.subSequence(3, 5));
	    
	    
	    //toString
	    StringBuffer str=new StringBuffer("Object Language");
	    String str2 = new String(str.toString());   
	    int pos = str2.indexOf("Language"); 
	     str.insert(pos,"Oriented"); 
	  
	    System.out.println("Modified String  :"+str); 

	

	}

}
