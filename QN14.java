import java.util.Scanner;

public class QN14 {
	
	public static void main(String[] args){
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = s.nextInt();
		System.out.println("Enter second number: ");
		int n2 = s.nextInt();
		for(n=n1; n<=n2; n++){
			int count=0;
			for(int i=2; i<=n/2; i++){
				if(n%i==0){
					count++;
					break;
				}
			}
			if(count == 0 && n != 1) {
				System.out.print(n + "\t");
			}
		}
	}
}
