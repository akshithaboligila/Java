import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any character");
		char ch=scan.next().charAt(0);
		MessageDecoder m = new MessageDecoder();
		System.out.println(m.decodeCharacter(ch));
		scan.close();
	}

}
