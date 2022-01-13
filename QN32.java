import java.util.Arrays;
import java.util.Scanner;

public class QN32 {
	
	public static int[] addX(int n, int arr[], int x){
		int i;
		int narr[] = new int[n + 1];
		for (i = 0; i < n; i++) {
			narr[i] = arr[i];
		}
		narr[n] = x;
		return narr;
	}

	
	public static void main(String[] args) {
		int n = 10;
		int i;
		Scanner s = new Scanner(System.in);
		int arr[] ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("\nInitial Array without adding:\n" + Arrays.toString(arr));
		System.out.print("\nEnter the new element for array: ");
		int x = s.nextInt();
		arr = addX(n, arr, x);
		System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
		
	}

}
