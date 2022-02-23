package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SynchronizedDemo {

	public static void main(String[] args) {
	//List<String> list = new ArrayList();
	//CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
	CopyOnWriteArraySet<String> list = new CopyOnWriteArraySet<String>();
	
	list.add("vasu");
	list.add("sharma");
	list.add("sjcbb");
	
	
	Iterator itr=list.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		list.add("helllo");
	}
	
	System.out.println("--------------");
	Iterator itr1 =list.iterator();
	
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());

	}
	
	

//	
//	for(String s:list)
//	{
//		
//	
//		list.add("hello");
//	}
//	
//	System.out.println("--------------");
//	for(String s:list)
//	{
//		
//		System.out.println(s);
//	
//	}
//
	}

}
