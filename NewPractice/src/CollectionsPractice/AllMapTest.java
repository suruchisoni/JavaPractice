package CollectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AllMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		hm.put(15, "value1");
		hm.put(115, "value231");
		hm.put(155, "value5451"); 
		hm.put(155, "value545");
		
	      /* Display content using Iterator*/
		Set set = hm.entrySet(); //returns the Set view containing all the keys and values.
		Iterator itr = set.iterator();
		
		System.out.println("------using iterator");
		while(itr.hasNext()){
			Map.Entry me = (Entry) itr.next();
			System.out.println("key is: "+ me.getKey() + " & Value is: ");
	         System.out.println(me.getValue());
		}
		
		//OR
		System.out.println("------using for loop");
		for(Map.Entry me: hm.entrySet()){
			System.out.println(me.getKey() +" :: "+ me.getValue());
		}
					
		/* Get values based on key*/
	      String var = hm.get(115);
	      System.out.println("Value at index 115 is: "+var);

	      /* Remove values based on key*/
	      hm.remove(155);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hm.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }
		
	      LinkedHashMap<Integer, String> lhmap = new  LinkedHashMap<Integer, String>();
	      lhmap.put(1, "anu");
	      lhmap.put(2, "Manu");
	      lhmap.put(3, "Tanu");
	      lhmap.put(4, "Kanu");
	      lhmap.put(4, "Kanu");
	      
	      Set set1 = lhmap.entrySet(); //returns the Set view containing all the keys and values.
			Iterator itr1 = set1.iterator();
			while(itr1.hasNext()){
				Map.Entry me1 = (Entry) itr1.next();
				System.out.println("key is: "+ me1.getKey() + " & Value is: ");
		         System.out.println(me1.getValue());
			}
			
			/* This is how to declare TreeMap */
		      TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		      /*Adding elements to TreeMap*/
		      tmap.put(1, "Data1");
		      tmap.put(23, "Data2");
		      tmap.put(70, "Data3");
		      tmap.put(4, "Data4");
		      tmap.put(2, "Data5");

		      /* Display content using Iterator*/
		      Set set3 = tmap.entrySet();
		      Iterator iterator = set3.iterator();
		      while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         System.out.println(mentry.getValue());

	}

}
}