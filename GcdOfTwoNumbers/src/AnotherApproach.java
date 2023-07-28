import java.util.Scanner;

public class AnotherApproach {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		int GCD=m;
		System.out.println("GCD is "+GCD);

	}

}
