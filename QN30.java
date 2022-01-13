import java.util.Scanner;

public class QN30 {
	
	public static void main(String[] args) {
		
		int c=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int n = s.nextInt();
		int arr[] = {56,34,64,2,6,64,56,4,54,8,23};
		for(int i = 0; i < arr.length; i++){
			if(n == arr[i])
			c++;
		}
		if(c!=0)
			System.out.println(n + " is in array and repeated " + c+ " times.");
		else
			System.out.println(n + " is not in array.");
		
	}
	
}
