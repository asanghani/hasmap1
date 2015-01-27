package hasmap1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Testmap {

	public static void main(String[] args) {
		
		HashMap <String, String> hm = new HashMap <String, String>();
		hm.put("1", "one");
		hm.put("2", "two");
		hm.put("3", "three");
		hm.put("4", "four");
		hm.put("5", "five");
		
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");		
	//  getting keyset() and writing loop to get value
		Set <String> keys = hm.keySet();
		for(String key:keys){
			System.out.println(key +"-------"+ hm.get(key));
		}
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	//	getting list of values()	
			Collection<String> values = hm.values();
			for(String value:values){
				//System.out.println(key +"-------"+ hm.get(key));
				System.out.println(value);
		}
			
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	// getting entryset()		
			Set set = hm.entrySet();
			System.out.println(set);
			
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");			
	// Use of Iterator		
			Iterator<String> keySetIterator = hm.keySet().iterator();
			while(keySetIterator.hasNext()){
			  String key = keySetIterator.next();
			  System.out.println("key: " + key + " value: " + hm.get(key));
			}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");			
	// sorting map
			System.out.println("Unsorted HashMap: " + hm);
			TreeMap sortedHashMap = new TreeMap(hm);     
			System.out.println("Sorted HashMap: " + sortedHashMap); 
			
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");				
	//checking map contain value or key ?		
			System.out.println("Does HashMap contains 1 as key: " + hm.containsKey("1"));
			System.out.println("Does HashMap contains five as value: " + hm.containsValue("five"));
			
			System.out.println("Does HashMap contains 21 as value: " + hm.containsValue(21)); 		
			System.out.println("Does HashMap contains 1(Integer) as key: " + hm.containsKey(1));
			
	System.out.println("+++++++++++++++++++++++Extra+++++++++++++++++++++++++++++++++");				
	//alternatively you can create HashMap from copying data from another Map or Hashtable as shown in below example:
			Hashtable<Integer, String> source = new Hashtable<Integer,String>();
			HashMap<Integer, String>  map = new HashMap(source);	
			
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
   //Checking map is empty or not?
			boolean isEmpty = map.isEmpty();
			System.out.println("Is HashMap is empty: " + isEmpty);		
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	//removing element or object from map?		
			Object value = map.remove("3");
			System.out.println("Following value is removed from Map: " + value);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");				
	//clears hashmap , removes all element		
			System.out.println("Size of Map: " + hm.size());
			hm.clear();                                         
			System.out.println("Size of Map: " + hm.size());		
	}
	
	

}

