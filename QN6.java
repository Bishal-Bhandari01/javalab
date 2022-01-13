import java.util.Scanner;

public class QN6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. My Details\n2. Company Details");
		System.out.println("Enter your choice: ");
		int y = scan.nextInt();
		switch(y) {
		case 1:
			System.out.println("Name: Bishal Bhandari");
			System.out.println("More details visit: bishalbhandari1.com.np");
			break;
		case 2:
			System.out.println("1. Company Name\n3. Company Number");
			System.out.println("Enter your choice: ");
			int x = scan.nextInt();
			switch(x) {
			case 1:
				System.out.println("Company Name: Aadim Innovation.");
				break;
			case 2:
				System.out.println("Company Number: 9848157414");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
		}
		

	}

}
