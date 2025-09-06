package oops;


class Employee{
	
	private int empid;
	public void setEmpid(int eid) {
		
		empid=eid;
	}
	
	public int getwmpid() {
		
		return empid;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmpid(101);
		
	System.out.println(e.getwmpid());
		

	}

}
