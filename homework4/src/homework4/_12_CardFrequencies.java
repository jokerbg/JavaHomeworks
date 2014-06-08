package homework4;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class _12_CardFrequencies {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] words = text.split(" ");
		String tempo = null;

		Map<String, Integer> cards = new LinkedHashMap<>();
		for (String word : words) {

			tempo = (word.charAt(0) == '1') ? "10" : "" + word.charAt(0);

			Integer count = cards.get(tempo);
			if (count == null) {
				count = 0;
			}
			cards.put(tempo, count + 1);
		}

		DecimalFormat formatter = new DecimalFormat("#0.00");

		for (String key : cards.keySet()) {

			System.out.println("" + key	+ " -> " + formatter.format((double)cards.get(key) / words.length * 100) + "%");
		}
	}
}