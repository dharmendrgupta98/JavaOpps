package oops;


class Test5{
	
	static int a=10;
	
	void m1() {
		
		 int b=20;
		 
		System.out.println(b);
	}
	
}



public class Static_concept {

	public static void main(String[] args) {
	
		Test5 t=new Test5();
		t.m1();
		System.out.println(Test5.a);
	}
	}


