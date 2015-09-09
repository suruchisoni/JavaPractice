package BasicJavaProgs;

public class Recursionexample {

		
		public  long factorial(int n){
		    if (n == 1)
		        return 1;
		    else
		        return n * factorial(n-1);
		}
		
			
		     
	    public String reverseString(String str){
	    	String reverse;
	        if(str.length() == 1){
	            return str;
	        } else {
	            reverse = str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
	            return reverse;
	        }
	    }
	     
	}


