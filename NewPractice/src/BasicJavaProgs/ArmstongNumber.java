package BasicJavaProgs;

public class ArmstongNumber {

	public int armstrong(int n) {
		
		int r = 0, sum = 0, temp = n;
		
		while(temp != 0){
			r = temp % 10;
			sum = sum + r*r*r;
			temp = temp/10;

		}
		return sum;
		
	}

}
