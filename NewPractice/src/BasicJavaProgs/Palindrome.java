package BasicJavaProgs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		{

		String s = "Madam";
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--){
			rev = rev + s.charAt(i);
		}
			System.out.print(rev+"\n");
			
			if(rev.equalsIgnoreCase(s)){
				System.out.println("String is palindrome");
			
			}		
		}
		{
		int num = 11;
		int r = 0;
		int x = num;

		while(x != 0){
		r = r * 10;
		r = r + num%10;
		x = x/10;
		}
		System.out.println(r);
		if(num == r)
			System.out.println("num is palindrome");
			else
				System.out.println("num is not palindrome");
		}
				
		
	}
	}
	



