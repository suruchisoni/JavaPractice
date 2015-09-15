package BasicJavaProgs;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		{
			String s = "aredf";
			char [] a = s.toCharArray();
		
		String[] fruits = {"apple", "mango", "banana"};
		Arrays.sort(a);
		Arrays.sort(fruits);
		
		String sorted = new String(a);
		System.out.println(sorted);
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		//sorting string without using API
		{
			String original = "adebc";
			char temp=0;
			 
			  char[] chars = original.toCharArray();
			 
			  for (int i = 0; i <chars.length; i++) {
			 
 			      for (int j = 0; j < chars.length; j++) {
			 
			       if(chars[j]>chars[i]){
			            temp=chars[i];
			           chars[i]=chars[j];
			           chars[j]=temp;
			       }
			 
			   }  
			 
			}
			 
			for(int k=0;k<chars.length;k++){
			System.out.println(chars[k]);
			}
			  
			}
//sorting integer array
		int[] array = {23,56,2,6,89};
		int temp=0;
		 
		 
		  for (int i = 0; i <array.length; i++) {
		 
			      for (int j = 0; j < array.length; j++) {
		 
		       if(array[j]>array[i]){
		            temp=array[i];
		            array[i]=array[j];
		            array[j]=temp;
		       }
		 
		   }  
		 
		}
		 
		for(int k=0;k<array.length;k++){
		System.out.println(array[k]);
		}
		  
		
		}

	}

}
