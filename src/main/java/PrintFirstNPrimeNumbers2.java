
public class PrintFirstNPrimeNumbers2 {
	
	public static Boolean checkprime(int n) {
		
		Boolean res = false;
		int i, m=n/2; 
		int flag=0;
		
		if(n==0 || n==1 || n%2==0) {
	
			flag=1;
			
		}
		
		else {
			
			for(i=2;i<=m;i++) {
				
				if(n%i==0) {
					
					flag = 1;
					break;
				}
			}
			
			if(flag==0)	 {
					System.out.println(n+" is a prime number");
					res=true;
					
				}
				
		}
		
		return res;
		}
	
	
	public static void printfirstNPrime(int n) {
		
		int cou=0;
		
        for(int i=1;i<=100;i++) {
			
			if(PrintFirstNPrimeNumbers2.checkprime(i)) {
           	 
           	 
           	 cou++;
           	 
           	  if(cou==n) {
           		  
           		  break;
           	  }
           	 
            }
            
            else {
           	 //System.out.println("Not a Prime Number");
            }
			
		}
		
		
	}
	
	
	public static int printNthprimeNumber(int nu) {
		
		int count=0;
		
		for(int i=0;i<=1000;i++) {
			
			if(PrintFirstNPrimeNumbers2.checkprime(i)) {
				
				count++;
				
				  
				if(count==nu) {
					
					System.out.println(i+" is "+nu+"th Prime Number");
					break;
				}
			}
		}
		
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		PrintFirstNPrimeNumbers2.printfirstNPrime(10);
		
		PrintFirstNPrimeNumbers2.printNthprimeNumber(7);
		
		
	}

}
