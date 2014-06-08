package homework3;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _09_ListOfProducts {

	public static void main(String[] args) {

		String item = null;
		String price = null;
		String line = "";
		Scanner scanno = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<String>();

		while (scanno.hasNextLine() && !(line = scanno.nextLine()).equals("")) {
			String opala = scanno.nextLine();
			lines.add(opala);
		}

		// Map<String, String> products = new TreeMap<>();
		//
		// for (int i = 0; i < lines.size(); i++) {
		//
		// String[] tempo = lines.get(i).split(" ");
		//
		// item = tempo[0];
		// price = (tempo[1]);
		// products.put(price, item);
		// }
		//
		// for (String key : products.values()) {
		// System.out.println("" + key + " " + products.get(key));
		// }

		scanno.close();
	}
}