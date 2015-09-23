package BasicJavaProgs;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class Palindrome {

	public boolean isPalindrome(String a) {
		int i = 0;
		int j = a.length() - 1;
		
		char[] Array = a.toCharArray();
		
		for(i = 0; i < j; i++,j--){
			if(Array[i] != Array[j]){
		}
			
			}
		return false;		
		}
	
	public boolean isNumPalindrome(int num){
		int r = 0;
		int x = num;

		while(x != 0){
		r = r * 10;
		r = r + num%10;
		x = x/10;
		}
		if(r == num){
		}
		return true;
		}
	
	@Test
	public void palindromeTest(){
		
		Palindrome p = new Palindrome();
		String a = "Madam";
		int num = 111;
		
		AssertJUnit.assertEquals(false, p.isPalindrome(a));
		AssertJUnit.assertEquals(true, p.isNumPalindrome(num));
	}
				
		
	}
	
	



