import java.util.Scanner;

public class QN9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int y = s.nextInt();
		
		for(int i=1;i<=y;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
