import java.util.Scanner;

public class Problem_07_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int n = entry.nextInt();
		System.out.println(Integer.toBinaryString(n));
//		String aBinary = Integer.toBinaryString(n);
		System.out.println(Integer.bitCount(n));
	}
}