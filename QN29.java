
public class QN29 {

	public static void main(String[] args) {
		
		int arr[] = {2,354,435,353,5};
		for(int i = 0; i<5; i++){
			for(int j = i+1; j<5; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second smallest number is: " + arr[1]);

	}

}
