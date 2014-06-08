package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String line = scanner.nextLine();
		String[] numbers = line.split(" ");
		int[] numDigits = new int[n];

		for (int i = 0; i < n; i++) {
			numDigits[i] = Integer.parseInt(numbers[i]);
		}

		// Sort the array of numbers
		Arrays.sort(numDigits);

		// Print the sorted array
		for (int i = 0; i < numDigits.length; i++) {
			System.out.print(numDigits[i] + " ");
		}
	}
}