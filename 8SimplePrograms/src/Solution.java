import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number greater than 100");
		int n=scan.nextInt();
		printNumbers(n);

	}
	public static void printNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
