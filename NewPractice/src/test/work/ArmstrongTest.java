package test.work;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasicJavaProgs.ArmstongNumber;

public class ArmstrongTest {
	@Test
	public void testArmstrong(){
		ArmstongNumber num = new ArmstongNumber();
		
		Assert.assertEquals(371, num.armstrong(371));
		
	}

}

// check for 371, 3 and 0 should not be equal