import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product code");
		String productCode=scan.next();
		getProduct(productCode);

	}
	public static void getProduct(String productCode)

	{
		switch(productCode) {
		case "P01":
			System.out.println("Coco Cola");
			break;
		
		case "P02":
			System.out.println("Sprite");
			break;
		
		case "P03":
			System.out.println("Mountain dew");
			break;
		default:
			System.out.println("water");
		}
	

	}

}
