package Work;

import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Name");
		list.add("Place");
		list.add("office");
		list.add("City");
		list.add("121");
		list.add("he");
		list.add("write");
		list.add("yes");
		list.add("no");
		list.add("100");
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		System.out.println(list.indexOf("he"));
		
			
	}

}
