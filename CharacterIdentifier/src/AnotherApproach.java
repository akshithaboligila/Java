import java.util.Scanner;

public class AnotherApproach {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any character");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);

	}
	public static void identifyCharacter(char ch)

	{
		if(Character.isDigit(ch)) {
			System.out.println("Entered character "+ch+" is a digit");
		}
		else if(Character.isLetter(ch)==false) {
			System.out.println("Entered character "+ch+" is a special character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					if(Character.isLowerCase(ch)) {
						System.out.println("Entered character "+ch+" is a lowercase vowel");
					}
					else {
						System.out.println("Entered character "+ch+" is a uppercase vowel");
					}
					break;
				default:
					if(Character.isLowerCase(ch)) {
						System.out.println("Entered character "+ch+" is a lowercase consonant");
					}
					else {
						System.out.println("Entered character "+ch+" is a uppercase consonant");
					}
			}
		}
	

	}

}
