package Work;

public class Fabonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int s;
		
		
		
		for(int i=0; i<=5; i++){
			s= a+b;
			a=b;
			b=s;
			System.out.println(s);
		}
		
			
			

	}

}
