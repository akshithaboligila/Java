import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range of numbers");
		int n=scan.nextInt();
		divisibleBy3(n);

	}
	public static void divisibleBy3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}

}
