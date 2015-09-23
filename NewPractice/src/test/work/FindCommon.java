package test.work;

import java.util.List;

import BasicJavaProgs.FindCommonInTwoArrays;

import org.junit.Assert;
import org.testng.annotations.Test;
public class FindCommon {
	
	@Test
	public void findTest(){
		
	FindCommonInTwoArrays find = new FindCommonInTwoArrays();
	Integer expected[] = {4,5,7,11};
	int[] a = {4, 3, 5, 7, 11};
	int[] b = {5, 4, 7, 8,11,12,13};
	List<Integer> result = find.commonIntegers(a, b);
	Assert.assertArrayEquals(expected, result.toArray());
	
	}

}
