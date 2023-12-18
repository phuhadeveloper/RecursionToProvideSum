package recursion;

import java.util.Scanner;

public class RecursionForSum {
	
	private final static int NUMBER_OF_NUM = 5;
	
	// recursion sum method
	public static void recursionForSum(int numOfRecurse) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter you first number: ");
		double sum = 0;
		
		// check to make sure user enter a valid number
		while (!scanner.hasNextDouble()) {
			System.out.println("Please enter a valid number: ");
			scanner.next();
		}
		
		sum += scanner.nextDouble();
		
		//recursion call to helper method
		recursionForSumHelper(numOfRecurse - 1, sum, scanner );
	}
	
	// recursion sum helper method 
	private static void recursionForSumHelper(int currDepth, double sum, Scanner scanner) {
		// base case
		if (currDepth == 0) {
			System.out.println("The sum is " + sum + "!");
		// recursive case
		} else {
			System.out.println("Please enter the next number: ");
			
			// check for valid integer input
			while (!scanner.hasNextDouble()) {
				System.out.println("Please enter a valid number: ");
				scanner.next();
			}
			
			sum += scanner.nextDouble();
			
			// recursion call
			recursionForSumHelper(currDepth - 1, sum, scanner);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome! Please enter " + NUMBER_OF_NUM + " numbers for summing.");
		recursionForSum(NUMBER_OF_NUM);
	}

}
