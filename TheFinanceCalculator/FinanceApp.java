package TheFinanceCalculator;
import java.util.*;
public class FinanceApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f\n",calculator.calculateSimpleInterest(principal,rate,time));
	}

}
