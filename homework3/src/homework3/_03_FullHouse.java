package homework3;

public class _03_FullHouse {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				if (j == i) {
					continue;
				}
				for (int c1 = 0; c1 < 4; c1++) {
					for (int c2 = c1 + 1; c2 < 4; c2++) {
						for (int c3 = c2 + 1; c3 < 4; c3++) {
							for (int d1 = 0; d1 < 4; d1++) {
								for (int d2 = d1 + 1; d2 < 4; d2++) {
									count++;
									System.out.print("(");
									face(i);
									suit(c1);
									face(i);
									suit(c2);
									face(i);
									suit(c3);
									face(j);
									suit(d1);
									face(j);
									suit(d2);
									System.out.println(")");
								}
							}
						}
					}
				}
			}
		}
		System.out.printf("%d full houses", count);
	}

	public static void face(int i) {
		switch (i) {
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		case 14:
			System.out.print("A");
			break;
		default:
			System.out.print(Integer.toString(i));
			break;
		}
	}

	public static void suit(int i) {
		switch (i) {
		case 0:
			System.out.print("♣");
			break;
		case 1:
			System.out.print("♦");
			break;
		case 2:
			System.out.print("♥");
			break;
		case 3:
			System.out.print("♠");
			break;
		}
	}
}