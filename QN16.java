import java.util.Scanner;

public class QN16 {

	public static void msumin(String[] sumrgs) {
		
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = s.nextInt();
		System.out.print("Enter second number: ");
		int n2 = s.nextInt();
		for(int i=n1;i<=n2;i++)
		{
		sum+=i;
		}
		System.out.println("Sum (" + n1 + "-" + n2 +"): " + sum);
		
	}

}
