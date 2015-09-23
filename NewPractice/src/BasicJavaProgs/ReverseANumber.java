package BasicJavaProgs;


public class ReverseANumber {

	public int reverseNumber(int n) {
     		int reverse = 0;
		 
	          while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	          
	      }
	          return reverse;
	      //System.out.println("Reverse of entered number is "+reverse);
	   }

		
		
	}


	
	
	

