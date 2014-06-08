package homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		File file = new File("src\\homework3\\Input.txt");
		BigDecimal sum = BigDecimal.ZERO;
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				sum = sum.add(BigDecimal.valueOf(Double.parseDouble(sc.nextLine())));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			return;
		}
		System.out.println(sum);
	}
}