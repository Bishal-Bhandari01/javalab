
public class QN21 {
	
	public static void main(String[] args){
		int sum=0;
		for(int n=1; n<=100; n++){
			int c=0;
			for(int i=2; i<=n/2; i++){
				if(n%i==0){
					c++;
					break;
				}
			}
			if(c== 0 && n!= 1) {			
				sum+=n;
			}
		}
		System.out.print("Sum of prime number (1-100) " + sum);
	}

}
