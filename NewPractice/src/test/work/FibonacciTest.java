package test.work;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.Fibonacci;

public class FibonacciTest {
	//creating variable fibonacci of class Fibonacci
	private Fibonacci fibonacci;
	
	@BeforeTest
	public void beforeTest(){
		fibonacci = new Fibonacci(); //creating a new object and passing it into fibonacci, creating here so that all methods in this class can use it.
	}
	
	@AfterTest
	public void afterTest(){
		fibonacci = null; //free memory
	}
	
	@Test
	public void testFibonacci(){
		int x[] = {0,1,1,2,3};
		int y [] = fibonacci.fibonacci(5);
		for (int l : y){
			System.out.println(l);
		}
		System.out.println("Array is " + y);
		Assert.assertEquals(fibonacci.fibonacci(5),x);  //object.method name
		
	}

}
