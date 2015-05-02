package test.work;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.SumOfN;

public class SumOfNTest {
	
	public SumOfN sumofn;
	
	@BeforeTest
	public void beforetest(){
		sumofn = new SumOfN();
	}
	
	@AfterTest
	public void aftertest(){
		sumofn = null;		
	}
	
	@Test
	public void testSumOfN(){
		
		Assert.assertEquals(sumofn.findSumOfNNumbers(10), 55);
		
	}
  /*  @Test
	public void testNegative(){
		Assert.assertEquals(sumofn.findSumOfNNumbers(-1), 55);
	}*/
}
