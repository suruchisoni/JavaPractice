package test.work;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasicJavaProgs.ReverseAString;

public class ReverseStringTest {
	
	@Test
	public void stringreversal(){
		ReverseAString rev = new ReverseAString();
		Assert.assertEquals("N", rev.stringReversal("N"));
		
	}

}


//test for: null, Names, My name, N, 