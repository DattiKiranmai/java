package TheTemparatureConverter;
import java.util.*;
public class TemparatureApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.printf("%.2f\n",temperatureConverter.convertFahrenheitToCelsius(a));
	}

}
