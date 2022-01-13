
public class QN28 {

	public static void main(String[] args) {
		
		int arr[] = {23,45,52,2,35};
		for(int i = 0; i<5; i++){
			for(int j = i+1; j<5; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Smallest elements is: " + arr[0]);

	}

}
