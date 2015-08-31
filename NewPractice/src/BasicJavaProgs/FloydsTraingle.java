package BasicJavaProgs;

public class FloydsTraingle {
	public static void main(String args[])
	   {
	      int n = 5, num = 1, c, d;
	     	 
	      System.out.println("Floyd's triangle :-");
	 
	      for ( c = 1 ; c <= n ; c++ )
	      {
	         for ( d = 1 ; d <= c ; d++ )
	         {
	            System.out.print(num+" ");
	            num++;
	         }
	 
	         System.out.println();
	      }
	   }

}
