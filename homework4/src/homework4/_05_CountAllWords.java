package homework4;

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String [] words = text.split("\\W+");
		System.out.println(words.length);

	}
}