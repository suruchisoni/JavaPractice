package work;

public class SumOfN {
	

	public long findSumOfNNumbers(int n){
		long result = 0;
		for(int i = 1; i <= n; i++){
			result += i;
		}
		return result;
	}
	
	}

