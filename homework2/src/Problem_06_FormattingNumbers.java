import java.util.Scanner;

public class Problem_06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = 23;
		double second = 3;
		double third = 4;

		String aHexString = Integer.toHexString(first).toUpperCase();
		String aBinary = String.format("%10s", Integer.toBinaryString(first))
				.replace(' ', '0');

		if (third % 1 == 0) {
			System.out.printf("|%5s|%s|%10.2f|%-10.0f|", aHexString, aBinary,
					second, third);
		}

		else {
			System.out.printf("|%5s|%s|%10.2f|%-10.0f|", aHexString, aBinary,
					second, third);
		}
	}
}