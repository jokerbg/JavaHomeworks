package homework4;

import java.util.Scanner;

public class _03_LargestSequenceEqualStrings {

	public static void main(String[] args) {

		int maxCount = 1;
		int currentCount = 1;

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] stringos = line.split(" ");

		String maxString = stringos[0];
		String currentString = stringos[0];

		for (int i = 1; i < stringos.length; i++) {

			if (stringos[i].equals(stringos[i - 1])) {
				currentCount++;
				currentString += " " + stringos[i];
				if (currentCount > maxCount) {
					maxCount = currentCount;
					maxString = currentString;
				}
			}

			else {
				currentString = stringos[i];
				currentCount = 1;
			}
		}
		System.out.println(maxString);
	}
}