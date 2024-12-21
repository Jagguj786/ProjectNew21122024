
public class PrimeNumbercheck {

	public static void primeCheck(int n) {
		
		int i, m=n/2; 
		int flag=0;
		
		if(n==0 || n==1 || n%2==0) {
			
			System.out.println(n+" is not a prime Number");
			
		}
		
		else {
			
			for(i=2;i<=m;i++) {
				
				if(n%i==0) {
					
					System.out.println(n+" is a not a prime number");
					flag = 1;
					break;
				}
			}
			if(flag==0)	 {
					System.out.println(n+" is a prime number");
				}
				
				
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbercheck.primeCheck(29);
	}

}
