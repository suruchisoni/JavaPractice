package BasicJavaProgs;

public class ArmstongNumber {

	public static void main(String[] args) {
		
		int n = 371;
		int r, sum = 0, temp = n;
		
		while(temp != 0){
			r = temp % 10;
			sum = sum + r*r*r;
			temp = temp/10;

		}
		if(sum==n){
			System.out.println("n is armstrong");
		}
		else{
			
			System.out.println("n is not armstong");
}

}
}