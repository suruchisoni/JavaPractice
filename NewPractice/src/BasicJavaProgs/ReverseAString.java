package BasicJavaProgs;

public class ReverseAString {

	public String stringReversal(String str) {

		if(str == null || str.length() == 0 || str.length() == 1 ){
			 return String.valueOf(str);
		}
		char[] strArray = str.toCharArray();
		
		int i = 0;
		int j = strArray.length - 1;
		char temp;
		for(i = 0; i < j; i++, j--){
			temp = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] = temp;
			
		}
		
		return String.valueOf(strArray);
				
		
		//using string buffer and reverse
		/*{
		StringBuffer sb = new StringBuffer("game plan");
		sb.reverse();
		System.out.println(sb);
		}*/
		
		//iterative method
				
			/*char[] strArray = str.toCharArray();
			 StringBuilder result = new StringBuilder();
			 
	        for (int i = strArray.length - 1; i >= 0; i--)
	        {
	            //System.out.print(strArray[i]); 
	        	result.append(strArray[i]);
	            
	        }
	        return result.toString();*/
	 
		}
		
		
	}


