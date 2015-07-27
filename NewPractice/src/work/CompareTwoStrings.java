package work;

public class CompareTwoStrings {

	public static void main(String[] args) {
   
		String s1 = "s";
		String s2 = "Su";
		
		if(s1.compareTo(s2) > 0)
			System.out.println("s1 is greater than s2");
		
		else if(s1.compareTo(s2) < 0)
			System.out.println("s2 is greater than s1");
		
		else 
			System.out.println("s2 and s1 are equal");
	}

}
