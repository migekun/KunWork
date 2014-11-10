package primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberTest {

/*
 * 
 * 
 * NO ES UNA SOLUCION CORRECTA!!!!
 * 
 * */
	public static void runPrimeOperation(int numberOfPrimesToShow) {
		int number = 2;
		System.out.println("Primos a mostrar: " + numberOfPrimesToShow);
		List<Integer> foundPrimes = new ArrayList<Integer>();
		while (foundPrimes.size() < numberOfPrimesToShow - 1) {
			if (is2Multiple(number)) number++;
			else if (isPrimeMultiple(foundPrimes, number)) number++;
			else {
				foundPrimes.add(number++);;
			}
		}
		
		System.out.print("1");
		for (Integer prime:foundPrimes) 
			System.out.print(" - " + prime);
	}
	
	private static boolean isPrimeMultiple(List<Integer> foundPrimes, int number) {
	    boolean isMultiplePrime = false;
		for (Integer prime : foundPrimes) {
			if ( number % prime == 0 && number % prime != number)  isMultiplePrime = true; break;
		}
		return isMultiplePrime;
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	private static boolean is2Multiple(int number) {
		return number % 2 == 0 && number != 2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runPrimeOperation(10);
	}

}
