package homework3;

import java.util.*;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			double num = input.nextDouble();
			String numNext = input.next();
			
			if (numNext.equals("deg")) {
				double num1 = Math.toRadians(num);
				System.out.printf("%.6f rad", num1);
				System.out.println();
				
			} else if (numNext.equals("rad")) {
				double num2 = Math.toDegrees(num);
				System.out.printf("%.6f deg", num2);
				System.out.println();
			}
		}
		input.close();
	}
}