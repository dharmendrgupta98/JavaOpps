package oops;


class Test{
	
	void show(int a) {
		
		System.out.println("1st");
	}
}

public class Overriding1 extends Test {
		 void show(int a) {
			 
			 System.out.println("2nd");
		 }
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.show(2);
		Overriding1 obj=new Overriding1();
		obj.show(3);
		

	}

}
