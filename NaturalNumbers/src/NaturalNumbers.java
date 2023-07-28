import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			
		sum+=i;
		}
		System.out.println("sum of "+n+" natural numbers is "+sum);
		

	}

}
