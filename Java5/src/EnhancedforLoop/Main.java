package EnhancedforLoop;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum1 = 0;
		for(int i=0; i<5; i++) {
			sum1+=arr[i];
		}
		System.out.println(sum1);
		
		// Java5
		int sum2 = 0;
		for(int i : arr) {
			sum2+=i;
		}
		System.out.println(sum2);

	}

}
