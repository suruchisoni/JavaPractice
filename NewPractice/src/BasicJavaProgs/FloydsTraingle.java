package BasicJavaProgs;
import org.testng.annotations.Test;

public class FloydsTraingle {
	
	public void floyds(int n){
	      int num = 1, c, d;
	     	 
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
	
	@Test
	public void fTest(){
		FloydsTraingle f = new FloydsTraingle();
		f.floyds(3);
	
	}
	
	

}
