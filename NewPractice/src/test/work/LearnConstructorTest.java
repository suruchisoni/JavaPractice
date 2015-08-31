package test.work;
import BasicJavaProgs.LearnConstructor;


public class LearnConstructorTest {
	
	
	public static void main(String args[]){
		 String name = "SS";
		 int size = 4654;
		 int totalArea;
		 int l, h;	
		
		LearnConstructor l1 = new LearnConstructor();
		LearnConstructor l2 = new LearnConstructor(2);
		LearnConstructor l3 = new LearnConstructor(1000,"rohit");
		LearnConstructor l4 = new LearnConstructor(size, name);
		l1.calculate();
		l2.calculate();
		
	}
	

}
