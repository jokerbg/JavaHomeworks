package homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] inputOne = scanner.nextLine().toCharArray();
		char[] inputTwo = scanner.nextLine().toCharArray();
		ArrayList<Character> first = new ArrayList<>();
		ArrayList<Character> second = new ArrayList<>();
		ArrayList<Character> result = new ArrayList<>();

		for (Character character : inputOne) {
			first.add(character);
		}

		for (Character character : inputTwo) {
			second.add(character);
		}

		result.addAll(first);

		for (int i = 0; i < second.size(); i++) {
			if (first.contains(second.get(i))) {
				continue;
			}

			else {
				result.add(' ');
				result.add(second.get(i));
			}
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
	}
}