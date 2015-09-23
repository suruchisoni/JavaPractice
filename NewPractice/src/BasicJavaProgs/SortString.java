package BasicJavaProgs;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class SortString {
	
	public String sort(String original)	{
				
		char temp=0;
		 
		  char[] chars = original.toCharArray();
		 
		  for (int i = 0; i <chars.length; i++) {
		 
			      for (int j = 0; j < chars.length; j++) {
		 
		       if(chars[j]>chars[i]){
		            temp=chars[i];
		           chars[i]=chars[j];
		           chars[j]=temp;
		       }
		 
		   }  
		 
		}
		 
		for(int k=0;k<chars.length;k++){
		System.out.println(chars[k]);
		}
		return String.valueOf(chars);
}
	@Test
	public void sortTest(){
		String original = "adebc";
		SortString s = new SortString();
		AssertJUnit.assertEquals("abcde", s.sort(original));
		
	}
}
