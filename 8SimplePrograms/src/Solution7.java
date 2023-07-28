import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range of numbers");
		int n=scan.nextInt();
		evenNumbersDivisibleBy3(n);
		

	}
	public static void evenNumbersDivisibleBy3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0&&i%3==0) {
				System.out.println(i);
			}
		}
	}

}
