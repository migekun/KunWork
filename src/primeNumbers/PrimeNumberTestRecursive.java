package primeNumbers;

public class PrimeNumberTestRecursive {

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else if (n % 2 == 0 && n != 2) {// multiplo de dos
			return false;
		} else {
			return isPrime(n, (int) Math.sqrt(n));
		}
	}

	private static boolean isPrime(int n, int r) {
		if (r < 2) {
			return true;
		} else if (n % r == 0) {
			return false;
		} else {
			return isPrime(n, --r);
		}
	}

	public static void generatePrimes(int n) {
		if (n < 2) {
			return;
		} else if (isPrime(n)) {
			System.out.println(n);
		}

		generatePrimes(--n);

	}

	public static void main(String[] args) {

		generatePrimes(30);
	}

}
