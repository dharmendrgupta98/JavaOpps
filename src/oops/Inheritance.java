package oops;

class Animal {

	void eat() {

		System.out.println("I am eating");
	}
}
class Dog extends Animal {

		void bark() {

			System.out.println("I amm barking");
			}
		}

	

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.bark();
	}

}
