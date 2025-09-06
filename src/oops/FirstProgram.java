package oops;


public class FirstProgram {
	
	
	public void eat() {
		
		
		System.out.println("I am eating");
	}
	
	 static class Bird{                 // inner class so need to static access-modifier
		
		public void fly() {
			
			
			System.out.println("I am flying");
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		FirstProgram buzo= new FirstProgram();
		buzo.eat();
		
		Bird Parraot= new Bird();
		Parraot.fly();
		Fruits banana= new Fruits();
		banana.color();

	}

}


class Fruits{              // outer class so no need to give it static access-modifier
	
	public void color() {
		
		System.out.println("I m green colocr");
	}
	
	
}
