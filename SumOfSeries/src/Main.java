import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scan.nextInt();
		calculateSumOfSeries(n);

	}
	public static void calculateSumOfSeries(int n)

	{
		double sum=0;
		for(double i=1;i<=n;i++) {
		sum=sum+1/i;
		
	}
	double res=sum;
	System.out.println(res);
}
}

	
