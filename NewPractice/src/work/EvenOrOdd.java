package work;

public class EvenOrOdd {
	
	public static void main(String args[])
	{
	//find even or odd
		{
			int x = 9;
		
	if( x % 2 == 0)	
		System.out.println("x is an even number");
	
	else
		System.out.println("x is an odd number");
		}
	
		//find even or odd from an array
		{
		//int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        
        for(int j=0; j < numbers.length; j++){
               
                               
                 if(numbers[j]%2 == 0)
                        System.out.println(numbers[j] + " is even number.");
                 else
                        System.out.println(numbers[j] + " is odd number.");
	}
}
}
}
