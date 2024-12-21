
public class FindDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "teste";
		int l = s.length();
		System.out.println(l);
		
		
		for(int i=0;i<=l-1;i++) {
		
		
		int count=0;	
		for(int j=0;j<=l-1;j++) {
			
			
		if(s.charAt(i) == s.charAt(j)) {
	    	
	    count++;	
	    	
	    }
		 
	    }
		
		System.out.println("No of "+ s.charAt(i) + " present is : "+count);
		
		}
		
	}

}
