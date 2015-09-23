package BasicJavaProgs;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class LargestOrSmallestwithIndex {
	
	public int largest(int[] n1)	{
				
		int smallest = n1[0];
		int largest = n1[0];
		//int lindex = 0, sindex = 0;
		
		for(int i = 1; i < n1.length; i++)
		{
			if(n1[i] > largest) {
				largest = n1[i];
		        //lindex = i; 
			}
			else if(n1[i] < smallest) {
				smallest = n1[i];
		        //lindex = i; 
			}
			
		}
		return largest;
	}
	
	public int smallest(int[] n2)	{
		int smallest = n2[0];
		for(int j = 1; j < n2.length; j++)
		{
			 if(n2[j] < smallest){
				smallest = n2[j];	
			//sindex = i;
		}
			 else if(n2[j] < smallest) {
					smallest = n2[j];
			        //lindex = i; 
				}
		}
	return smallest;
	}
	
	@Test
	public void test(){
		int [] n1 = { 1,5,7,88,-1};
		int [] n2 = { 1,5,7,88,-1};
		LargestOrSmallestwithIndex l = new LargestOrSmallestwithIndex();
		AssertJUnit.assertEquals(88, l.largest(n1));
		AssertJUnit.assertEquals(-1, l.smallest(n2));
		
		
	}
}