import java.util.Scanner;

public class Problem_03_PointsInsideFigure {

	public static void main(String[] args) {

		Scanner coord = new Scanner(System.in);
		double aX = coord.nextDouble();
		double aY = coord.nextDouble();

		if (aX > 17.5 && aX < 20 && aY > 8.5 && aY < 13.5) {
			System.out.println("Outside");
		}
		else if (aX >= 12.5 && aX <= 22.5 && aY >= 6 && aY <= 13.5) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}