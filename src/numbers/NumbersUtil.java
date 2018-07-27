package numbers;

import java.util.Random;

public class NumbersUtil {
	Random random = new Random();

	public void printInt() { // does not accept an argument
		System.out.println(random.nextInt());

	}

	public void printRandomInt(int upper) { // accept an argument

		if (upper <= 0) {
			System.out.println("Invalid argument");
			return; // return's meaning is quit from method
		} else {

			// random number between of 0 and upper
			System.out.println(random.nextInt(upper));
		}
	}

	public void printRandomIntRange(int lower, int upper) { // accept multiple arguments

		int rNum = random.nextInt(upper);

		while (rNum < lower) {

			rNum = random.nextInt(upper);
		}
		System.out.println(rNum);
	}

	public int getInt() { // return value does not accept an argument

		return random.nextInt();
	}

	public int getRandomInt(int upper) { // return value accept an argument
		if (upper <= 0) {
			System.out.println("Fatal Error");
			System.exit(0);
		}
		return random.nextInt(upper);

	}

	public boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		} else if (num % 2 == 0 && num != 2) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					// System.out.println("Divisible by " + i);

					return false;

				}
			}
		}
		return true;
	}

	public int getMax(int num1, int num2, int num3) { // return value accept multiple arguments
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		}
		return num3;
	}

	public int countPrimes(int upper) {
		int counter = 0;
		for (int i = 0; i < upper; i++) {
			if (isPrime(i)) { // When 2 methods are in same class, you don't need create an object
				counter++;

			}
		}
		return counter;
	}

	public int[] getPrimeNumbersRange(int upper) {

		int countP = countPrimes(upper);
		int[] primesArray = new int[countP];
		int index = 0;
		for (int num = 0; num < upper; num++) {
			if (isPrime(num)) { // When 2 methods are in same class, you don't need create an object
				primesArray[index] = num;
				index++;
			}
		}
		return primesArray;
	}

}
