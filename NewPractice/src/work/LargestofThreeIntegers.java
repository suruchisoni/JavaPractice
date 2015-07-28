package work;

public class LargestofThreeIntegers {

	public static void main(String[] args) {

		int x = 2 , y = 54 , z = 9;
		
		if(x > y && x > z)
			System.out.println("x is the largest number");
		
		else if(y > x && y > z)
		System.out.println("y is the largest number");
		
		else if(z > x && z > y)
		System.out.println("z is the largest number");
	}

}
