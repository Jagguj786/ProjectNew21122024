import java.util.Arrays;

public class CheckTwoStringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Grab";
		String s2="Brug";
		
		//Most Imp after converting to lowercase assign to existing string
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//chatGPT Program
		//Comparing both the arrays using in-built function equals ()  
        if(Arrays.equals(ch1, ch2) == true) {  
            System.out.println("Both the strings are anagram");  
        }  
        else {  
            System.out.println("Both the strings are not anagram");  
        }  
		
		
		
		//My Program
		for(int i=0;i<s1.length();i++) {
			
			System.out.print(ch1[i]+" ");
			
		}
		
		System.out.println("");
        for(int i=0;i<s1.length();i++) {
			
			
			System.out.print(ch2[i]+" ");
		}
		
		
		System.out.println();
		if(s1.length()!=s2.length()) {
			
			System.out.println("Not an Anagram");
			
		}
		
		else {
		
		for(int i=0;i<s1.length();i++) {
			
			if(ch1[i]==ch2[i]){
					System.out.println("It is Anagram");
				}
				
				else {
					System.out.println("Not a Anagram");
				}
				
		}
		
	}
  }
}
