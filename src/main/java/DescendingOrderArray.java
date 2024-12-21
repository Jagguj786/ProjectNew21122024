import java.util.Arrays;

public class DescendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] arr=new int[] {34,5,7,8,39,9};
		
		Arrays.sort(arr);
		
        for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
			
		}
		
	}

}
