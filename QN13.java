
public class QN13 {

	public static void main(String[] args) {

		int n;
		for(n=1; n<=100; n++){
			int c=0;
			for(int i=2; i<=n/2; i++){
				if(n%i==0){
					c++;
					break;
				}
				if(c == 0 && n != 1) {
					System.out.print(n + "\t");
				}
			}
		}

	}

}
