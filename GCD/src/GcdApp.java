import java.util.Scanner;
public class GcdApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCD gcd=new GCD();
		int res=gcd.findGCD(m, n);
		System.out.println("GCD of "+m+" and "+n+" is "+res);
	}

}
