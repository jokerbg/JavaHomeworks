import java.util.Scanner;

public class Problem_02_TriangleArea {

	public static void main(String[] args) {

		Scanner side = new Scanner(System.in);
		int aX = side.nextInt();
		int aY = side.nextInt();
		int bX = side.nextInt();
		int bY = side.nextInt();
		int cX = side.nextInt();
		int cY = side.nextInt();

		double a = Math.sqrt((bX - cX) * (bX - cX) + (bY - cY) * (bY - cY));
		double b = Math.sqrt((aX - cX) * (aX - cX) + (aY - cY) * (aY - cY));
		double c = Math.sqrt((bX - aX) * (bX - aX) + (bY - aY) * (bY - aY));

		if ((a + b > c) && (a + c > b) && (c + b > a)) {

			int area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
			System.out.println(area);
		}

		else {
			System.out.println(0);
		}
	}
}