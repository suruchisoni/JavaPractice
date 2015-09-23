package BasicJavaProgs;

public class EvenOrOdd {
	
	public void findOddEven(int x){
		{
		
	if( x % 2 == 0)	
		System.out.println("x is an even number");
	
	else
		System.out.println("x is an odd number");
		}
	
		
	/*public findNum(int[] num){
			
        for(int j=0; j < num.length; j++){
               
                               
                 if(num[j]%2 == 0)
                        System.out.println(num[j] + " is even number.");
                 else
                        System.out.println(num[j] + " is odd number.");
	}
}*/
  }
	
public static void main(String args[]) {
		
	EvenOrOdd obj = new EvenOrOdd();
		
		obj.findOddEven(5);
	}
	
}
