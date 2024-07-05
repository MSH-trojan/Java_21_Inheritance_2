package superclass;

public class Superclass{
	public void printMethod() {
		System.out.println("print from the super class!");
	}
}

class Subclass extends Superclass{
	public void printMethod(){
		super.printMethod();
		System.out.println("Print from Subclass!");
	}
	
	public static void main(String[] args) {
		
		Subclass A = new Subclass();
		
		A.printMethod();
		
	}
}