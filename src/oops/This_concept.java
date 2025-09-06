package oops;


class Test2{
	
	int i;
	
	void show(int i) {
		this.i=i;
		
	}
	
	void display() {
		System.out.println(i);
	}
	
}

public class This_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Test2 t=new Test2();
		t.show(10);
		t.display();
		
	}

}
