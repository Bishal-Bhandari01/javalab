import java.util.Scanner;

public class QN35 {
	
	static String name, email;
	static int rollNo;
	static long phoneNo;

	QN35(String n, int r, String e){
		name = n;
		rollNo = r;
		email = e;
	}

	QN35(String n, int r, String e, long p){
		name = n;
		rollNo = r;
		email = e;
		phoneNo = p;
	}

	void infoDisplay(){
		System.out.println("\nStudent Details");
		System.out.println("Name: "+ name);
		System.out.println("Roll No.: "+ rollNo);
		System.out.println("Email: "+ email);
		System.out.println("Phone Number: "+ phoneNo);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Details");
		System.out.print("What is your name? ");
		name = s.nextLine();

		System.out.print("Enter your roll number: ");
		rollNo = Integer.parseInt(s.nextLine());

		System.out.print("Enter your email: ");
		email = s.nextLine();

		System.out.print("Enter your phone Number: ");
		phoneNo = Long.parseLong(s.nextLine());

		QN35 s1 = new QN35(name,rollNo,email,phoneNo);
		s1.infoDisplay();

	}

}
