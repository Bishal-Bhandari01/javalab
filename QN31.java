import java.util.Scanner;

public class QN31 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] arr = {24,57,27,4,24,47,47,3};

		System.out.println("Available Array:\n");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nEnter Element to be deleted : ");
		int e = s.nextInt();

		for(int i = 0; i < arr.length; i++){
			if(arr[i] == e){
				for(int j = i; j < arr.length - 1; j++){
					arr[j] = arr[j+1];
				}
				break;
			}
		}

		System.out.println("\nAfter removing element " + e + "\n");
		for(int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
