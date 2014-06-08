package homework4;

import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {

		int count = 0;
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] words = text.split("\\W+");

		String specified = scanner.nextLine();

		for (String current : words) {
			if (current.equalsIgnoreCase(specified)) {
				count++;
			}
		}
		System.out.println(count);
	}
}