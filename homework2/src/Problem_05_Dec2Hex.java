import java.util.Scanner;

public class Problem_05_Dec2Hex {

	public static void main(String[] args) {
		Scanner dec = new Scanner(System.in);
		int number = dec.nextInt();
		System.out.println(Integer.toHexString(number).toUpperCase());
	}
}