import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height in real number");
		double inches = scan.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.println(converter.convertInchesToFeet(inches));
		scan.close();
	}

}
