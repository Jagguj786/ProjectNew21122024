
public class MinMaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//For Maximim
		int[] arr = new int[]{34,5,7,87,9};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
				
			}
			
		}
		
		System.out.println("Largest number is "+max);
		
		
		
		//For Minimum
        int[] arr2 = new int[]{34,5,7,87,9};
		
		int min=arr2[0];
		
		for(int i=0;i<arr2.length;i++) {
			
			if(arr2[i]<min) {
				
				min=arr2[i];
				
			}
			
		}
		
		System.out.println("Largest number is "+min);
		
		
	}

}
