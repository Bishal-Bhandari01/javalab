
public class QN19 {

	public static void main(String[] args) {
		
		int s = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0) {
				s+=i;
			}
		}
		System.out.println("Sum of even number (1-100): " + s);

	}

}
