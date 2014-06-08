package homework4;

import java.util.Scanner;

public class _02_SequencesEqualStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] stringos = line.split(" ");

		System.out.print(stringos[0]);

		for (int i = 1; i < stringos.length; i++) {
			
			if (stringos[i].equals(stringos[i - 1])) {
				System.out.print(" " + stringos[i]);
			} 
			
			else {
				System.out.println();
				System.out.print(stringos[i]);
			}
		}
	}
}