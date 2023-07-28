import java.util.Scanner;
public class GcdApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		//GCD gcd=new GCD(); 
		int res=findGCD(m, n);
		System.out.println("GCD of "+m+" and "+n+" is "+res);
	}
	public static int findGCD(int m,int n) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		int gcd=m;
		return m;
		
	}

}
