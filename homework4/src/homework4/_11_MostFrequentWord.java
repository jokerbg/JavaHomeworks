package homework4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().toLowerCase();
		String[] words = text.split("\\W+");
		int keyMax = 0;

		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
			if (count > keyMax) {
				keyMax = count;
			}
		}
		for (String key : wordsCount.keySet()) {
			if (wordsCount.get(key) == keyMax + 1) {
				if (keyMax > 0) {
					System.out.println("" + key + " -> " + wordsCount.get(key)+ " times");
				} else {
					System.out.println("" + key + " -> " + wordsCount.get(key)+ " time");
				}
			}
		}
	}
}