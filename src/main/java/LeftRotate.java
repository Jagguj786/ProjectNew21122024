
public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,5};
		
		int n=3;
		
		//Original Array
        for(int g=0;g<arr1.length;g++){
			
			System.out.print(arr1[g]+" ");
		}
		
		System.out.println("");
        
		for(int i=0;i<n;i++) {
			
			int first = arr1[0];
			
			
			for(int k=0;k<arr1.length-1;k++) {
				arr1[k] = arr1[k+1];
			}
			
			arr1[arr1.length-1]=first;
			
		  }
		
		for(int g=0;g<=arr1.length-1;g++){
			
			System.out.print(arr1[g]+" ");
		}
			
		}
		
		
		

	}


