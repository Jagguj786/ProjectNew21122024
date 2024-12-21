
public class BubblesortWithNumbers {
	
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Loop through each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Track whether any swap happened
            boolean swapped = false;
            
            // Last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            //System.out.println(swapped);
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] arr = {64, 34, 25, 12, 22,0, 11, 90};
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);
        
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }	
		
	}

}
