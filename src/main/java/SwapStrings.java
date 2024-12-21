
public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Good ", str2 = "Morning ";    
		 
		System.out.println("Before swapping :"+str1+""+str2);
		
		
		//Swapping with temp or 3rd variable
		String str3;
		
		str3=str2;
		str2=str1;
		str1=str3;
		
		System.out.println("After swapping :"+str1+""+str2);
		
		
		//Swapping without temp or 3rd variable
		String s1 = "Hello ", s2 = "Worlds "; 
		System.out.println("Before Swapping :"+s1+""+s2);
		int l=s1.length();
		
		s1=s1+s2;
		
		
		s2=s1.substring(0, s1.length()-s2.length());
		
		
		s1=s1.substring(l, s1.length());
		
		System.out.println("Before Swapping :"+s1+""+s2);
		
		
		
		
		
		
		
		
		
		
	}

}
