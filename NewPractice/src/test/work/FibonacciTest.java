package test.work;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicJavaProgs.Fibonacci;

public class FibonacciTest {
	Fibonacci fibo = new Fibonacci();
	
	@Test
	public void testFibonacci(){
		int x[] = {0,1,1,2,3,5,8,13};
		int y [] = fibo.fibonacci(8);
		for (int l : y){
			System.out.println(l);
		}
		Assert.assertEquals(y,x);  
		
	}

}
