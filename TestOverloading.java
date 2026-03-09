
public class TestOverloading {

	public void method1() {
		System.out.println("Method 1 in Test class");
	}

	public void method1(int i) {
		System.out.println("Method 2 in Test class");
	}

	public void method1(double d) {
		System.out.println("Method 3 in Test class");
	}

	public void method1(char c) {
		System.out.println("Method 4 in Test class");
	}

	public static void main(String[] args) {
		TestOverloading test = new TestOverloading();
		test.method1();
		test.method1(10);
		test.method1(3.14);
		test.method1('a');
	}

}
