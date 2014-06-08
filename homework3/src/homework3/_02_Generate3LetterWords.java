package homework3;

import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		char[] input = intro.next().toCharArray();

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int j2 = 0; j2 < input.length; j2++) {
					System.out
							.print("" + input[i] + input[j] + input[j2] + " ");
				}
			}
		}
	}
}