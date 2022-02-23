package CollectionFramework;
import java.util.ArrayList;

public class GetSetDemo {
	
	public static void main(String args[])
	{
		ArrayList obj = new ArrayList();
		obj.add("Anuj");
		obj.add("Bhandari");
		System.out.println(obj);
		
		System.out.println("Element  "+obj.get(1));
		
		obj.set(1,"Sharma");
		System.out.println(obj);
	//contains  method	
		System.out.println(obj.contains("Mehak"));
		
//		for(int i=0;i<obj.size();i++)
//		{
//			System.out.println(obj.get(i));
//		}
//		

	}

}
