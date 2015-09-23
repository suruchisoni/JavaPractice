package BasicJavaProgs;

public class MissingNum {
	
	public static void main(String args[]){
		
		int[] a = {1,2,4};
		int sum = 0;
		int n = 4;
		int sumOfN = (n*(n+1))/2;
		System.out.println(sumOfN);
		
		for(int i = 0; i < a.length; i++){
			 sum = sum + a[i]; 
		}
		System.out.println("Missing number" +(sumOfN-sum)  );
	}

}
