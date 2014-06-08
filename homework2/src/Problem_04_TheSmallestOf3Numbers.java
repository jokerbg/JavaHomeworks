import java.util.Scanner;

public class Problem_04_TheSmallestOf3Numbers {

	public static void main(String[] args) {
		double min = Double.MAX_VALUE;
		Scanner entry = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			double current = entry.nextDouble();
			if (current < min) {
				min = current;
			}
		}

		System.out.println(min);
	}
}