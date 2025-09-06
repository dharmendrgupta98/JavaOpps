package oops;

abstract class Vehicle{
	
	abstract void  start();
	
}
class Car extends Vehicle{
		void start() {
		System.out.println("Car start with key");
		}
}

class Scooter extends Vehicle{
	
	void start() {
		
		System.out.println("Scooter start with kick");
	}
}

public class Abstraction {

	public static void main(String[] args) {
	//Vehicle v=new Vehicle();       // Abstarct class can't be creat object
	Car c =new Car();
	c.start();
	
	Scooter s=new Scooter();
	
	s.start();
	
	
}
}
