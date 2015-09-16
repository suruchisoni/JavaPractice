package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Others {

	public static void main(String[] args) {
	
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(3);
        arrayList.add(40);
        arrayList.add(5);
        arrayList.add(6);
        
        Collections.sort(arrayList);
        System.out.println("After sorting  :" + arrayList);
       
        for(Object a: arrayList){
        	System.out.println(a);
        }
		

        //convert keys of map to list
        
        Map<Integer, String> hm = new HashMap<Integer, String> ();
        hm.put(12, "abe");
        hm.put(45, "new");
        hm.put(45, "new");
        System.out.println("converted keys to list");
        List<Integer> l = new ArrayList<Integer>(hm.keySet());
        for(Integer key: l){
        	System.out.println(key);
        }
        
        //convert values to list
        System.out.println("converted values to list");
        List<String> v = new ArrayList<String>(hm.values());
        for(String value: v){
        	System.out.println(value);
        }
        
        //convert map to list
        
        Set set = hm.entrySet();
        List<String> list = new ArrayList<>(set);
        System.out.println("converted map to arraylist");
        Iterator itr = set.iterator();
        while(itr.hasNext()){
        	Entry<Integer, String> e = (Entry<Integer, String>) itr.next();
        	System.out.println(e);
        }
        
        
        
        }
        
        
	}


