import java.util.Scanner;

public class QN33 {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String name, address,email;
		Long phoneNo;
		System.out.println("Enter your Details");
		System.out.print("Full Name: ");
		name = s.nextLine();

		System.out.print("Address: ");
		address = s.nextLine();

		System.out.print("Email: ");
		email = s.nextLine();

		System.out.print("Phone Number: ");
		phoneNo = s.nextLong();

		System.out.println("\n\nYour Personal Details");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Email: " + email);
	}

}
