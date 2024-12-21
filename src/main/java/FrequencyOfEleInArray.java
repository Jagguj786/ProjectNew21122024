import java.util.HashSet;
import java.util.Set;

public class FrequencyOfEleInArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int count=0;

		int[] array = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		
		Set<Integer> set = new HashSet<>();
		
		
		
		for(int i=0;i<=array.length-1;i++) {
		
		set.add(array[i]);
		
		}
		
		System.out.println(set);
		
		for (int element : set) {
            //System.out.println(element);
            int count=0;
            for(int k=0;k<=array.length-1;k++) {
            	
            	if(element==array[k]) {
            		count++;
            	}
            	
            	else {
            		
            	}
            	
            }
            
            System.out.println(element+" is repeating "+count+" times");
        }
		
		
		
	}

}
