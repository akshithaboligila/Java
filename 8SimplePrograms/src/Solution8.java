import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range of numbers");
		int n=scan.nextInt();
		oddNumbersDivisibleBy5(n);

	}
	public static void oddNumbersDivisibleBy5(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0&&i%5==0) {
				System.out.println(i);
			}
		}
	}

}
