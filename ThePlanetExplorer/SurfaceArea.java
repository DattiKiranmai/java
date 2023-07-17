package ThePlanetExplorer;

import java.util.Scanner;

public class SurfaceArea {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();

		System.out.println(explorer.calculateSurfaceArea(radius));
	}

}
