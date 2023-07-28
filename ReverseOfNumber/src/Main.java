
public class Main {
	public int reverseOfNumber(int n) {
		int rev=0;
		while(n!=0){
			int rem=n%10;
			rev=rev*10;
			rev=rev+rem;
			n=n/10;
		}
		return rev;
		
	}
}
