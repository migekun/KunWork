package fizzBuzz;

public class FizzBuzz {

	public static void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (is3Mul(i) && is5Mul(i)) System.out.println("Fizz-Buzz");
			else if (is3Mul(i)) 		System.out.println("Fizz");
			else if (is5Mul(i)) 		System.out.println("Buzz");
			else 						System.out.println(i);
		}
	}

	private static boolean is5Mul(int i) {
		return i % 5 == 0;
	}

	private static boolean is3Mul(int i) {
		return i % 3 == 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fizzBuzz();
	}

}
