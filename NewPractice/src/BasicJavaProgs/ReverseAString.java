package BasicJavaProgs;

public class ReverseAString {

	public static void main(String[] args) {
		//using string buffer and reverse
		{
		StringBuffer sb = new StringBuffer("game plan");
		sb.reverse();
		System.out.println(sb);
		}
		
		//iterative method
		{
			String str = "My Java";
			char[] strArray = str.toCharArray();
			 
	        for (int i = strArray.length - 1; i >= 0; i--)
	        {
	            System.out.print(strArray[i]);   
	        }
	 
	        System.out.println();								
		}
		
		
	}

}
