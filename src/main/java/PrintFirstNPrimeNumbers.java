
public class PrintFirstNPrimeNumbers {
    
	public static void firstNprimeNumbers(int count) {
		
		int flag=0;
		System.out.println("2 is a Prime Number");
		System.out.println("3 is a Prime Number");
		
		for(int i=2;i<=25;i++) {
			
                if(i%2==0) {
				
				//System.out.println(i+" is not a prime number");
				continue;
				
				}
                
                if(i%2!=0) {
			
			for(int k=3;k<=i/2;k+=2) {
			    
				
				
				if(i%k==0) {
					//System.out.println(i+" is not a prime number");
					
					break;
					
				           }
				else{
					System.out.println(i+" is Prime");
					break;
				}
				
			}
			
	}
               
			
	}
			
				
			
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintFirstNPrimeNumbers.firstNprimeNumbers(10);
	}

}
