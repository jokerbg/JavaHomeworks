package homework4;

import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {

		int maxCount = 1;
		int currentCount = 1;

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] stringos = line.split(" ");

		String maxString = stringos[0];
		String currentString = stringos[0];

		System.out.print(stringos[0]);

		for (int i = 1; i < stringos.length; i++) {

			if (Integer.parseInt(stringos[i]) > Integer.parseInt(stringos[i - 1])) {
				currentCount++;
				currentString += " " + stringos[i];
				System.out.print(" " + stringos[i]);
				if (currentCount > maxCount) {
					maxCount = currentCount;
					maxString = currentString;
				}
			}

			else {
				currentString = stringos[i];
				currentCount = 1;
				System.out.println();
				System.out.print(stringos[i]);
			}
		}
		System.out.println("\nLongest: " + maxString);
	}
}