package BasicJavaProgs;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		String s = "aredf";
		char [] a = s.toCharArray();
		
		String[] fruits = {"apple", "mango", "banana"};
		
		Arrays.sort(a);
		Arrays.sort(fruits);
		
		String sorted = new String(a);
		System.out.println(sorted);
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}

	}

}
