package TheHeightConverter;
import java.util.*;
public class HeightApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double inches=scan.nextDouble();
		HeightConverter converter = new HeightConverter();

		System.out.printf("%.2f\n",converter.convertInchesToFeet(inches));
		
	}

}
