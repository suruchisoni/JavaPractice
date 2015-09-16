package CollectionsPractice;

public class MergeArrays {
	public static int[] merge(int[] a, int[] b) {
        
	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}

	public static void main(String args[]){
		int[] a = {2,22,54,98};
		int[] b = {5,25,65,87,100};
		int[] answer = merge(a,b);
		for (int j=0; j<answer.length;j++)
		System.out.print(answer[j]+ " ");
	}
}
