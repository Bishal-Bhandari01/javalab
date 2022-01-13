
public class QN26 {

	public static void main(String[] args) {
		
		int arr[] = {2,35,23,55,34,5};
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Largest elements is: " + arr[0]);
		
	}

}
