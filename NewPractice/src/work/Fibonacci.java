package work;

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
	

}
