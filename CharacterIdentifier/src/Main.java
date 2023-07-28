import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);

	}
	public static void identifyCharacter(char ch)

	{
		if(Character.isLowerCase(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				System.out.println("Lowercase vowel");
			}
			else {
				System.out.println("Lowercase consonant");
			}
		}
		else if(Character.isUpperCase(ch)) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U'){
				System.out.println("Uppercase vowel");
			}
			else {
				System.out.println("Uppercase consonant");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	

	}

}
