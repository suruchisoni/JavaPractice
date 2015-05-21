package test.work;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.MultiplicationTable;

public class TableTest {
	public MultiplicationTable mTable;
	
	@BeforeTest()
	  public void beforeTest()
	{
		mTable =  new MultiplicationTable();
	}
	
    
	
	@AfterTest()
	public void afterTest() {
		mTable = null;
	}
    
	@Test
	public void testTableOfN(int n) {
		Assert.assertEquals(mTable.tableOfN(9),18);
		

	}

}
