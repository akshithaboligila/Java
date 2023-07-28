import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range of numbers");
		int n=scan.nextInt();
		divisibleBy2(n);

	}
	public static void divisibleBy2(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
