package oops;

interface i1{
	
	
	 void show();
	
}

 class Test1 implements i1{
	 public void show() 
	 {
		 System.out.println("1");
		 
	 }
	
	
}

public class Interface_exa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t =new Test1();
		t.show();
	}

}
