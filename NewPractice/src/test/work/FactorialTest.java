package test.work;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicJavaProgs.Factorial;

public class FactorialTest {

	public Factorial factorial;

	@BeforeTest()
	public void beforeTest() {
		factorial = new Factorial(); 
	}

	@AfterTest()
	public void afterTest() {
		factorial = null;
	}

	@Test
	public void testFactorial() {

		Assert.assertEquals(factorial.factorialOfN(4), 24);

	}

}
