class Animal {
	// no-implementation
}

class Dog extends Animal {
	// no-implementation
}

public class TestOverloading4 {

	public void method1(Animal a) {
		System.out.println("Animal called");
	}

	public void method1(Dog d) {
		System.out.println("Dog called");
	}

	public static void main(String[] args) {
		TestOverloading4 test = new TestOverloading4();
		Animal a = new Animal();
		test.method1(a);

		Dog d = new Dog();
		test.method1(d);

		Animal a2 = new Dog();
		test.method1(a2);
		
		test.method1(null);
	}

}

