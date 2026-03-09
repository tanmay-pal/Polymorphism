class Vehicle {
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle {
	@Override
	public void run() {
		System.out.println("Car is running");
	}
}

public class TestOverriding {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(); // parent class reference and parent class object
		v.run();

		Car c = new Car(); // child class reference and child class object
		c.run();

		Vehicle v2 = new Car(); // parent class reference and child class object
		v2.run();

	}

}

// @formatter:off
/**
 * - signature should be same for method overriding.
 * - parent class reference can refer to child class object but child class reference cannot refer to parent class object.
 * - Can't reduce the visibility of the overridden method. If the parent class method is declared as public, then the child 
 * 		 class overridden method must also be declared as public.
 * 		 If the parent class method is declared as protected, then the child class overridden method 
 *       can be declared as protected or public, but not private.
 *       
 *     		public -> public, protected -> protected or public, default -> default or protected or public,  private -> private (not allowed)
 */
