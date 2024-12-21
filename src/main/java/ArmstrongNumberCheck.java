
public class ArmstrongNumberCheck {
	
	public static void armstrongCheck(int number) {
		
		
		String numberStr = Integer.toString(number);
	    
	    // Create an array of the same length as the string
	    int[] intArray = new int[numberStr.length()];
	    
	    // Populate the array with each digit
	    for (int i = 0; i < numberStr.length(); i++) {
	        intArray[i] = numberStr.charAt(i) - '0'; // Convert char to int
	    }
		
		
		int n=intArray.length;
		//System.out.println(n);
		double g=0;
		
		for(int i=0;i<n;i++) {
			
			g=Math.pow(intArray[i],n)+g;
			
		}
		
		if(g==number) {
			
			System.out.println(number+" is Armstrong number");
		}
		else {
			System.out.println(number+" is not Armstrong number");
		}
		
		
		
	}
	
	
	public static void printArmstrongupto1000() {
		
		for(int k=1;k<1000;k++) {
			
			String numberStr = Integer.toString(k);
		    
		    // Create an array of the same length as the string
		    int[] intArray = new int[numberStr.length()];
		    
		    // Populate the array with each digit
		    for (int i = 0; i < numberStr.length(); i++) {
		        intArray[i] = numberStr.charAt(i) - '0'; // Convert char to int
		    }
			
			
			int n=intArray.length;
			//System.out.println(n);
			double g=0;
			
			for(int i=0;i<n;i++) {
				
				g=Math.pow(intArray[i],n)+g;
				
			}
			
			if(g==k) {
				
				System.out.println(k+" is Armstrong number");
				
			}
//			else {
//				System.out.println(k+" is not Armstrong number");
//			}
			
		}
		
		
		
		
		//return null;
		
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumberCheck.armstrongCheck(153);
		
		ArmstrongNumberCheck.printArmstrongupto1000();
	}

}
