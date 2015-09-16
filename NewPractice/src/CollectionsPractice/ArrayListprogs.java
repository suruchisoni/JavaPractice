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
		System.out.println("normal iteration gives----");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		int lastIndex = a.lastIndexOf("2"); // to find last index of element
		System.out.println("finding index----");
		System.out.println("last" +" " + lastIndex);
		
		Collections.sort(a);
		while(itr.hasNext()){
			System.out.println("Sorting result----");
			System.out.println("sorted" + itr.next());
		}
		
         List l = a.subList(0,3);
         System.out.println("Finding sublist---");
		for(int i = 0; i < l.size(); i ++){
			
			System.out.println(l.get(i));
		}
		{
		System.out.println("Replacing at a index----");
		a.set(2, "100"); // to replace at a index
		while(itr.hasNext()){
			System.out.println("adding" + itr.next());
		}
			
		}	
		
		
		boolean b = a.contains("200"); //if element exixts
		System.out.println("checking if element exists" +b);
		
		int index = a.indexOf("2");
		System.out.println("index is" + index);
		{
			Object obj = l.remove(0);
			System.out.println("removing from index-----");
			System.out.println("removed" + obj);
			
			for(int j = 0; j < a.size(); j ++){
				System.out.println(a.get(j));
			}
		}
			{
				
			//add vector to arraylist
				ArrayList al = new ArrayList();
				
				al.add("1");
				al.add("2");
				al.add("9");
				al.add("5");
				al.add("2");
				
				Vector ve = new Vector();
				ve.add("34");
				ve.add("56");
				ve.add("98");
				
				al.addAll(0, ve);
				System.out.println("adding vector to array list");
				Iterator i = al.iterator();
				while(i.hasNext()){
					System.out.println(i.next());
				}
					//OR
				System.out.println("adding vector using for loop");
					for(int k = 0; k < al.size(); k++){
						
					System.out.println(al.get(k));
					}
					
			}
		}
		
}


