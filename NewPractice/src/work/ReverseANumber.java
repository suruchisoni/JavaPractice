package work;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 765, reverse = 0;
		 
	          while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
	   }
	}


