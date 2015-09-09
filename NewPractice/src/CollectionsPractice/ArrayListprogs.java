package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListprogs {

	public static void main(String[] args) {
		
		// get sublist of arraylist
		ArrayList a = new ArrayList();
		
		a.add("1");
		a.add("2");
		a.add("9");
		a.add("5");
		a.add("2");
		
		Iterator itr = a.iterator();
		/*
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		int lastIndex = a.lastIndexOf("2"); // to find last index of element
		System.out.println("last" +" " + lastIndex);*/
		
		Collections.sort(a);
		while(itr.hasNext()){
			System.out.println("sorted" + itr.next());
		}
		/*
		a.set(2, "100"); // to replace at a index
		while(itr.hasNext()){
			System.out.println("adding" + itr.next());
		}*/
			
		/*List l = a.subList(0,3);
		
		for(int i = 0; i < l.size(); i ++){
			System.out.println("sublist" + l.get(i));
		}*/
		
		
		
		
		boolean b = a.contains("200"); //if element exixts
		System.out.println(b);
		
		int index = a.indexOf("2");
		System.out.println("index is" + index);
			/*Object obj = l.remove(0);
			
			System.out.println("removed" + obj);
			
			for(int j = 0; j < a.size(); j ++){
				System.out.println("after removing" + a.get(j));
			}
			//add vector to arraylist
				Vector v = new Vector();
				v.add("34");
				v.add("56");
				v.add("98");
				
				a.addAll(1, v);
				
				while(itr.hasNext()){
					System.out.println("iterating" + itr.next());
				}
						
					for(int k = 0; k < a.size(); k++){
					System.out.println("adding vector" + a.get(k));
					}*/
					
					
		}
		
}


