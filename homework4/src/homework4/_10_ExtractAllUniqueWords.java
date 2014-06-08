package homework4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().toLowerCase();
		String[] words = text.split("\\W+");

		Set<String> unique = new TreeSet<>();
		for (String word : words) {
			unique.add(word);
		}

		for (String word : unique) {
			System.out.print(word + " ");
		}
	}
}