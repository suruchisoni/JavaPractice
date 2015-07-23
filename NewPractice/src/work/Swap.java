package work;

public class Swap {

	public static void main(String[] args) {
         //using temp
		{
			int x = 2, y = 5, temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " +x);
		System.out.println("y = " +y);
	}
		//without using temp
		{
			int x =2, y= 5;
			x = x+y;
			y = x - y;
			x = x - y;
			
			System.out.println("x = " +x);
			System.out.println("y = " +y);
			
			
		}
	
	}

}
