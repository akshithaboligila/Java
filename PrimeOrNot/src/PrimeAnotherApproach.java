import java.util.Scanner;

public class PrimeAnotherApproach {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		if(n<2) {
			System.out.println("Not a prime");
		}
		else {
			boolean isPrime=true;
			for(int i=2;i*i<=n;i++) {
				if (n%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println("Entered number "+n+" is prime");
			}
			else {
				System.out.println("Entered number "+n+" is not a prime");
			}
		}

	}

}
