import java.util.Scanner;

public class Problem_08_CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int n = entry.nextInt();
		int pairs = 0;
		do {
			if (((n >> 1) & 1) == (n & 1)) {
				pairs++;
			}
			n >>= 1;
		} while (n != 0);
		System.out.println(pairs);
	}
}