import java.util.Scanner;

public class ClassApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number to caluclate sum of digits");
		int n=scan.nextInt();
		Class c=new Class();
		int res=c.calculateSumOfDigits(n);
		System.out.println(res);
	}
	

}
