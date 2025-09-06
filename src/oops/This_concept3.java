package oops;

class Test4{
    
	Test4(This_concept3 tc) {
      System.out.println("test class contructor");
	
                    }

}

public class This_concept3 {

	
	void m1() {
		
    	Test4 t=new Test4(this);
	   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		This_concept3 td=new This_concept3();
		td.m1();
	}
}

