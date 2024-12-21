import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsANDCharInString {
	
	
	
	public static void reverseWordsInString() {
		
		String s= "Test cricket is the best";
		
		String[] str = s.split(" ");
		
		int k=str.length;
        System.out.println(k);
		
		for(int i=k-1;i>=0;i--) {
			
			System.out.println(str[i]);
			
		}
		
		
	}
	
	public static void newApproachusingListCollections(String str) {
		
        str = str.trim();
        
        // Split the string into words and convert it into a list
        List<String> wordsList = Arrays.asList(str.split(" "));
        
        // Reverse the list of words
        Collections.reverse(wordsList);
        
        for(String s:wordsList) {
        	System.out.println(s);
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome";
		
		char[] ch=str.toCharArray();
		
		int l=ch.length;
		System.out.println(l);
		
		for(int i=l-1;i>=0;i--) {
			
			
			System.out.println(ch[i]);
			
		}
		
		ReverseWordsANDCharInString.reverseWordsInString();
		
	}
	
	
	
	
	

}
