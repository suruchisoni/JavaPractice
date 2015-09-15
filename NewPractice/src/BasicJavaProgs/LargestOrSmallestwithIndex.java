package BasicJavaProgs;

public class LargestOrSmallestwithIndex {
	
	public static void main(String args[])
	{
		
		int num[] = {56,3,85,95,45,101,63, -1};
		
		int smallest = num[0];
		int largest = num[0];
		int lindex = 0, sindex = 0;
		
		for(int i = 1; i < num.length; i++)
		{
			if(num[i] > largest) {
				largest = num[i];
		        lindex = i; 
			}
		
			else if(num[i] < smallest){
				smallest = num[i];	
			sindex = i;
		}
		}
	
	System.out.println("Largest Number is : " + largest);
	System.out.println("Largest index is : " + lindex);
	System.out.println("Smallest Number is : " + smallest);
    System.out.println("Smallest index is : " + sindex);
}
}