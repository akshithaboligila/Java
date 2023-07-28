import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Main m=new Main();
		int rev=m.reverseOfNumber(n);
		System.out.println("Reverse of a number is "+rev);
		if(n==rev) {
			System.out.println("Entered number "+n+" is a palindrome");
		}
		else {
			System.out.println("Entered number "+n+" is not a palindrome");
		}
	}
	

}
