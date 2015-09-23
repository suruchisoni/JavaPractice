package test.work;

import org.junit.Assert;
import org.testng.annotations.Test;

import BasicJavaProgs.ReverseANumber;

public class ReverseNumberTest {
	
	
	public void numberTest(){
		
		ReverseANumber rev = new ReverseANumber();
		Assert.assertEquals(567, rev.reverseNumber(765));
		
	}
		
public void zeroValueTest(){
		
		ReverseANumber rev = new ReverseANumber();
		Assert.assertEquals(0, rev.reverseNumber(0));
	
}
		
	public void negativeValueTest(){
			
			ReverseANumber rev = new ReverseANumber();
			Assert.assertEquals(-78, rev.reverseNumber(-87));
		
	}
	@Test	
public void largeNumberTest(){
		
		ReverseANumber rev = new ReverseANumber();
		Assert.assertEquals(999567567, rev.reverseNumber(765765999));
		
	}

}