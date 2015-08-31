package BasicJavaProgs;

public class Student {
	int rollno, age;
	String name;
	
	public Student(int rollno, int age, String name){
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
    public String toString() {
		return rollno +" "+ age +" "+ name;          
          }

}
