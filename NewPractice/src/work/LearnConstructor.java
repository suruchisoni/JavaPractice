package work;

public class LearnConstructor {
	
	int size = 12;
	int area;
	String name = "Sweetu";
	boolean canDo = true;
	int l, h;
	public LearnConstructor(){
		size = 40;
		
		System.out.println(size);
		}

	
	public LearnConstructor(int newSize){
		this.size = newSize;
		System.out.println(newSize);
	}
	
	public LearnConstructor(int newSize,String newName){
		this.size = newSize;
		this.name = newName;
		String output = newSize  +" "+  newName;
		System.out.println(output);
	}
	
	public void calculate(){
		area = size *5;
		System.out.println(area);
				
	}
}



