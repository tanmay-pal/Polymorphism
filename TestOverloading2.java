
public class TestOverloading2 {

	public void method1() {
		System.out.println("Method 1 in Test class");
	}

	public void method1(int i) {
		System.out.println("Method 2 in Test class");
	}

	public void method1(double d) {
		System.out.println("Method 3 in Test class");
	}

	public static void main(String[] args) {
		TestOverloading2 test = new TestOverloading2();
		test.method1('a');
	}

}























/**
 * byte -> short  -> int -> long -> float -> double
 *         char   -> int -> long -> float -> double
 */

