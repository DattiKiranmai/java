package TheJourneyCalculator;
import java.util.*;
public class CalculatorApp {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			double speed=scan.nextDouble();
			double time=scan.nextDouble();
			JourneyCalculator journeyCalculator = new JourneyCalculator();
			System.out.printf("%.2f\n",journeyCalculator.calculateDistance(speed,time));
		}
	}



