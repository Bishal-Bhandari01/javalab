import java.util.Scanner;

public class QN22 {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = s.nextInt();
		System.out.print("Enter second number: ");
		int n2 = s.nextInt();
		
		for(int n=n1; n<=n2; n++){
			int c=0;
			for(int i=2; i<=n/2; i++){
				if(n%i==0){
					c++;
					break;
				}
			}
			if(c == 0 && n!= 1) {
			sum+=n;
			}
		}
		System.out.println("Sum of prime number("+n1+"-"+n2+"): "+sum);

	}

}
