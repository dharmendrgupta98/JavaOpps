package oops;

public class Varargs {
	
	
	void  show(int a) {
		System.out.println("int method");
	}
	
	void show(int... a) {
		
		System.out.println("verargs method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Varargs obj=new Varargs();
		obj.show(10,12,23);
		obj.show(15);
	}

}
