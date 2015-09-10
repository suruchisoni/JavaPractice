package BasicJavaProgs;

public class FibonacciRecursive {
	public void fibanci(int n1,int n2){
		  int sum=0;
		  if(n1==0){
		  System.out.println(n1+"\n"+n2);
		  }
		  sum=n1+n2;
		  if(sum<=10){
		   System.out.println(sum);
		   n1=n2;
		   n2=sum;
		   
		   fibanci(n1,n2);
		   
		  }
		 }
		 
		 public static void main(String[] args) {
		  
			 FibonacciRecursive fb=new FibonacciRecursive();
		      fb.fibanci(0,1);
		 }

}
