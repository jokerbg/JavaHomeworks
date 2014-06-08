package homework3;

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of hands: ");
		int hands = sc.nextInt();
		System.out.println();
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		// char[] patterns = {'♣', '♦', '♥', '♠'};
		char[] patterns = { '\u2663', '\u2665', '\u2660', '\u2666' };
		boolean[] isCardUsed = new boolean[52];

		for (int i = 0; i < hands; i++) {
			for (int j = 0; j < 5; j++) {
				Random r = new Random();
				int card;
				int pattern;
				do {
					card = r.nextInt(12);
					pattern = r.nextInt(4);
					if (!isCardUsed[card * 4 + pattern]) {
						System.out.print(cards[card] + "" + patterns[pattern]
								+ " ");
						isCardUsed[card * 4 + pattern] = true;
						break;
					}
				} while (isCardUsed[card * 4 + pattern]);
			}
			System.out.println();
		}
	}
}