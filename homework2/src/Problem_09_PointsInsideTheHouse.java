import java.util.Scanner;

public class Problem_09_PointsInsideTheHouse {

	public static void main(String[] args) {
		boolean insideTria = false;
		Scanner entry = new Scanner(System.in);
		//entry point is Z (x,y)
		double x = entry.nextDouble();
		double y = entry.nextDouble();

		double x1 = 12.5, y1 = 8.5;
		double x2 = 17.5, y2 = 3.5;
		double x3 = 22.5, y3 = 8.5;

		//calculate the area of the triangles abZ, acZ, bcZ and abc
		double abc = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double abZ = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		double acZ = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		double bcZ = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));
		
		//check if area of triangles abZ, acZ and bcZ sums to area of triangle abc
		//if so, then point x should be inside abc
		if (abZ + acZ + bcZ == abc) {
			insideTria = true;
		}

		if ((((x >= 12.5 && x <= 17.5) || (x >= 20 && x <= 22.5)) && (y <= 13.5 && y >= 8.5))
				|| insideTria) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}