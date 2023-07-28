import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		checkMultipleOfFirstNumber(n1,n2);

	}
	public static void checkMultipleOfFirstNumber(int n1,int n2)

	{
		if (n1%n2==0) {
			System.out.println("The number "+n1+" is a multiple of "+n2);
		}
		else {
			System.out.println("The number "+n1+" is not a multiple of "+n2);
		}
	

	}
}
