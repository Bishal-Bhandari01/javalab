import java.util.Scanner;

public class QN12 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = s.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			if(i%2==0) {
				
				System.out.println(i);
			}
		}
		
	}

}
