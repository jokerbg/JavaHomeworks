package homework4;

import java.util.Scanner;

public class _07_CountSubstringOccurences {

	public static void main(String[] args) {

		int count = 0;
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		String pattern = scanner.nextLine();

		for (int i = 0; i <= text.length() - pattern.length(); i++) {
			if (text.substring(i, i + pattern.length()).equalsIgnoreCase(pattern)) {
				count++;
			}
		}
		System.out.println(count);
	}
}