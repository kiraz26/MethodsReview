package numbers;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NumbersUtil class is in same package, no need to import
		NumbersUtil numUtil = new NumbersUtil();
		numUtil.printInt(); // invoking/calling the method
		numUtil.printInt();

		// I want to specify the upper range.

		numUtil.printRandomInt(50);
		numUtil.printRandomInt(100);
		numUtil.printRandomInt(-100);
		numUtil.printRandomInt(1000);

		// a number between 100 - 1000

		numUtil.printRandomIntRange(5, 10);

		System.out.println("------------------------------");
		System.out.println(numUtil.getInt());

		int a = numUtil.getInt();
		if (a > 0) {
			System.out.println("It is a positive int " + a);
		} else {
			System.out.println("It is a negative int " + a);
		}

		int ran = numUtil.getRandomInt(5);
		System.out.println(ran);

		switch (ran) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;

		default:
			break;
		}
		System.out.println("------------PRIME-------------");
		// Positive whole number that is divisible only by 1 and itself

		int num = 33;

		if (num <= 1) {
			System.out.println(false);
		} else if (num % 2 == 0 && num != 2) {
			System.out.println(false);
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("Divisible by " + i);
					System.out.println(false);
					// break;
				}
			}
		}
		// isPrime()
		num = 53;
		numUtil.isPrime(num);
		System.out.println(numUtil.isPrime(num));

		boolean pr = numUtil.isPrime(numUtil.getRandomInt(100));
		System.out.println(pr);
		pr = numUtil.isPrime(numUtil.getRandomInt(numUtil.getRandomInt(100)));
		System.out.println(pr);

		// getMax()
		int l = numUtil.getMax(4, 3, 1);
		System.out.println(l);
		l = numUtil.getMax(5, 5, 1);
		System.out.println(l);
		l = numUtil.getMax(1, 6, 1);
		System.out.println(l);
		l = numUtil.getMax(1, 7, 7);
		System.out.println(l);

		System.out.println("----------PRIME RANGE-------------");

		int counter = 0;
		// 1) count how many prime numbers in range
		for (int i = 0; i < 55; i++) {
			if (numUtil.isPrime(i)) {
				counter++;
				System.out.println(i);
			}
		}
		int[] primes = new int[counter];
		// 2) get all prime numbers in range to an array
		counter = 0;
		for (int i = 0; i < 55; i++) {
			if (numUtil.isPrime(i)) {
				counter++;
			}
		}
		System.out.println("----------PRIME COUNTER METHOD-------------");
		
		int pCount = numUtil.countPrimes(55);
		System.out.println(pCount);
		
		
		System.out.println("----------PRIME RANGE INTO ARRAY METHOD-------------");
		
		int[] primeNumbers = numUtil.getPrimeNumbersRange(55);
		
		for (int prime : primeNumbers) {
			System.out.print(prime+" ");
		}
		
		
		
	}

}
