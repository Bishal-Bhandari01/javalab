import java.util.Scanner;

public class QN18 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = s.nextInt();
		System.out.println("Enter second number: ");
		int n2 = s.nextInt();
		for(int i=n1;i<=n2;i++)
		{
		if(i%2!=0)
		sum+=i;
		}
		System.out.println("Sum of odd number (" + n1 + "-" + n2 + "): " + sum);

	}

}
