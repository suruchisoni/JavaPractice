package BasicJavaProgs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeDupString {
    public String deDupStr(char[] a) {
			
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
		char[] r = new char[i+1];
		
		for(int k = 0; k <r.length; k++){
			r[k] = a[k];
			System.out.println(r[k]);
		}
		return String.valueOf(r);
		
	}
	
	@Test
	public void dupsTest(){
		DeDupString dups = new DeDupString();
		String[] a = {"A", "A", "B", "C", "C", "C", "E", "F", "F", "G"};
	    String[] expected = {"A", "B", "C", "E","F", "G"};
		Assert.assertEquals(dups.deDupStr(a), expected);		
	}


}
