import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to print fibonacci series");
		int n=scan.nextInt();
		Main m=new Main();
		m.fibonacciSeries(n);

	}

}
