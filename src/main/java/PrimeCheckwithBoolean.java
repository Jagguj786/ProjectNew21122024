
public class PrimeCheckwithBoolean {

public static Boolean primeCheck(int n) {
	
		Boolean res = false;
		int i, m=n/2; 
		int flag=0;
		
		if(n==0 || n==1 || n%2==0) {
			
			//System.out.println(n+" is not a prime Number");
			flag=1;
			
		}
		
		else {
			
			for(i=2;i<=m;i++) {
				
				if(n%i==0) {
					
					//System.out.println(n+" is a not a prime number");
					flag = 1;
					break;
				}
			}
			
			if(flag==0)	 {
					System.out.println(n+" is a prime number");
					res=true;
					//System.out.println(res);
				}
				
				
			
			
		}
		//System.out.println(res);
		return res;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

         if(PrimeCheckwithBoolean.primeCheck(29)) {
        	 
        	 System.out.println("Prime Number");
         }
         
         else {
        	 System.out.println("Not a Prime Number");
         }
         
         
         //Print prime numbers by checking each number
         for(int i=2;i<=50;i++) {
        	 
        	 if(PrimeCheckwithBoolean.primeCheck(i)) {
            	 
            	 //System.out.println("Prime Number");
             }
             
             else {
            	 //System.out.println("Not a Prime Number");
             }
         }
	}

}
