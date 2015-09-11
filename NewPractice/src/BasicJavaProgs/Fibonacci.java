package BasicJavaProgs;

public class Fibonacci {

	public int [] fibonacci(int n){
		int first = 0;
		int second = 1;
		int sum;
		int [] result = new int[n];
		result[0] = first;
		result[1] = second;
		for(int i=2; i < n; i++){
			sum = first + second;
			first = second;
			second = sum;
			result[i] = sum;
	    }
		return result;
	}
	
	
	public static void main(String args[]){
		Fibonacci f = new Fibonacci();
		int [] x = f.fibonacci(8);
		for (int i : x){
			System.out.println(i);
		}
		
			
	}
	

}
