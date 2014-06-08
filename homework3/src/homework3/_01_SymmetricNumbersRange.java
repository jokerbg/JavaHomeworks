package homework3;

import java.util.Scanner;

public class _01_SymmetricNumbersRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		for (int i = start; i <= end; i++) {
			if (i < 10) {
				System.out.print(i + " ");
				continue;
			}
			char[] tempo = Integer.toString(i).toCharArray();
			if (tempo.length == 2 && tempo[0] == tempo[1]) {
				System.out.print(i + " ");		
			}
			else if (tempo.length == 3 && tempo[0] == tempo[2]) {
				System.out.print(i + " ");	
			}
		}
	}
}