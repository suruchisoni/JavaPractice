package BasicJavaProgs;

public class Fibonacci1 {
	public static void main(String args[]){
		int n1 = 0;
		int n2 = 1, k;
		System.out.println(n1);
		System.out.println(n2);
		for(int i = 2; i<8; i++){
			k = n1 + n2;
			System.out.println(k);
			n1 = n2;
			n2 = k;
							
		}
	}
	

}
