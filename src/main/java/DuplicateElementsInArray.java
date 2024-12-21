import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {2,5,6,7,4,7,2,5,1,5};
		
		Set<Integer> set = new HashSet<>();    
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(Integer num:set) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				
				if(num==arr[i]) {
					count++;
				}
			}
			
           if(count>1) {
				
				System.out.println(num);
			}
			
		}

	}

}
