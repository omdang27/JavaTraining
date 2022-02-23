package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	public static void main(String[] args) {

	ConcurrentHashMap<String,String> map=new ConcurrentHashMap<String, String>();
	map.put("india","delhi");
	map.put("america", "washington");
	
//	System.out.println(map);
//
//	System.out.println(map.values());
//	
//	System.out.println(map.keySet());
//	
//	System.out.println(map.get("india"));
//	
//	System.out.println(map.containsKey("india"));
//	
//	map.replace("india", "asa");
//	
//	System.out.println(map);
	
	Set set=map.entrySet();
	
	Iterator itr=set.iterator();
	
	while(itr.hasNext())
	{  
	   Map.Entry m= (Map.Entry)itr.next();
	   map.put("china", "shenghai");
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	System.out.println(map);

	}

}
