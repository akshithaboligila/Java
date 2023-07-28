import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade");
		int grade=sc.nextInt();
		checkGrade(grade);

	}
	public static void checkGrade(int grade)

	{ 
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
