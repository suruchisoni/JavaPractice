package test.work;

import java.util.ArrayList;
import java.util.Iterator;

import BasicJavaProgs.Student;


public class CollectionsTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, 10, "Suru");
		Student s2 = new Student(102, 11, "Potu");
		Student s3 = new Student(103, 12, "Motu");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		al.remove(s1);
		
        Iterator itr = al.iterator();
        
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        
        
		/*for(Student obj : al){
			System.out.println(obj);
			
		}*/
	

	}

}
