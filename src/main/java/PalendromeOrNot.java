
public class PalendromeOrNot {
	
	
	public static void checkPalendrome(String s) {
		
		
        int l = s.length();
		int n = l-1;
		
		int h=n/2;
		System.out.println(h);
		
		Boolean res = true;
		
		
		//Below both lines works to check Palendrome
		//for(int i=0;i<=n/2;i++) {
		for(int i=0;i<=n;i++) {
			
			
			if(s.charAt(i)!=s.charAt(n-i)) {
				
				System.out.println("It is not a Palendrome");
				res = false;
				break;
				
			}
			
		}
		
		if(res) {
			
			System.out.println("It is a Palendrome");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		PalendromeOrNot.checkPalendrome("racehjcar");
		
	}

}
