package BasicJavaProgs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String[] data = {"E", "C", "B", "E", "A", "B", "E", "D", "B", "A"};
		
		List<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);
		String[] result = new String[set.size()];
		set.toArray(result);
				
		for(Object e: result){
			System.out.println(e);
		}
		
		int[] a = {2,2,4,5,7,7,8};
		int[] r = new int[a.length];
		for(int i = 0; i < a.length-1; i++){
				if(a[i] == a[i+1])
				i++;
				else
				r[i] = a[i+1];
		}
		for(int k = 0; k <r.length; k++){
			System.out.println(r[k]);
		}

	}
	
	

}
