

public class Class {
	public int calculateSumOfDigits(int n) {
		
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
		

		}
}
