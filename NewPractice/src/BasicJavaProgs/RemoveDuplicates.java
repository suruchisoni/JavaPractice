package BasicJavaProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

import org.testng.Assert;

public class RemoveDuplicates {

	public int[] deDup(int[] a) {
		
		/*String[] data = {"E", "C", "B", "E", "A", "B", "E", "D", "B", "A"};
		
		List<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);
		String[] result = new String[set.size()];
		set.toArray(result);
				
		for(Object e: result){
			System.out.println(e);
		}*/
		
		
		int i = 0;
		int j = 1;
		
		while(j < a.length){
			if(a[i] == a[j]){
				j++;
			}
			
			else{
				a[++i] = a[j++];
			}
						
		}
		int[] r = new int[i+1];
		
		for(int k = 0; k <r.length; k++){
			r[k] = a[k];
			System.out.println(r[k]);
		}
		return r;
		
	}
	
	@Test
	public void dupsTest(){
		RemoveDuplicates dups = new RemoveDuplicates();
		int[] a = {2,2,2,4,5,7,7,7,7,8,10};
		int[] expected = {2,4,5,7,8,10};
		Assert.assertEquals(dups.deDup(a), expected);
		
	}

}
