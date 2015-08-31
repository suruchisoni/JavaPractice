package BasicJavaProgs;

import java.util.Scanner;

public class Test {
	
	 public static void main(String args[])
	 {
		 int i,j,c;
         c=1;
loop1: for(i=1;i<=6;i++)
            {
              for(j=1;j<=i;j++)
              {
                     if(c>6)
                          continue loop1;
                  System.out.print(" "+c);
                   c++;                   
             }
             System.out.println("\n");
        }
	 }
	 
	 
	   {/*
	      {
	    	  int x, y, temp;
	      
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	      }
	      
	      {

	  		
	  		int fact = 1;
	  		for(int i=3; i >= 1; i--){
	  			fact=fact*i;
	  		}
	  		System.out.println(fact);
	  		}
	    
	      
	  	
	      */}
	      
	      
	   }


