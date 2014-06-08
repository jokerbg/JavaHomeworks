package homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		Pattern email = Pattern.compile("[A-Za-z]+[.-_]*[A-Za-z]+@[A-Za-z]+[-]*[.A-Za-z]+[A-Za-z]");
		Matcher matcher = email.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}