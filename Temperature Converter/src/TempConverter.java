import java.util.Scanner;
public class TempConverter {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter celsius as real number");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.println(temperatureConverter.convertFahrenheitToCelsius(f));
		scan.close();
	}
}
