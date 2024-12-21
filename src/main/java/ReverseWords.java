import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	
	
	public static String reverseWords(String str) {
		
        str = str.trim();
        
        // Split the string into words and convert it into a list
        List<String> wordsList = Arrays.asList(str.split(" "));
        
        // Reverse the list of words
        Collections.reverse(wordsList);
        
        // Join the words back into a single string
        return String.join(" ", wordsList);
        
    }
	
//	public static String reverseCharsInaString(String str2) {
//		
//		str2 = str2.trim();
//		char[] Array=str2.toCharArray();
//		
//		List<char> charlist = Arrays.asList(str.split(""));
//		
//		
//		
//		return null;
//		
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 String str1 = "Hello World";

		 String[] words = str1.split(" ");
		 
		 int k=words.length;
		 System.out.println(k);

		 StringBuilder reversed = new StringBuilder();

		 for (int i = words.length-1; i >= 0; i--) {

		 reversed.append(words[i]).append(" ");

		 }

		 System.out.println("Reversed Words: " + reversed.toString().trim());
		 
		 
		 
		 
		 
		 System.out.println("uy5964756748678");
		 
		    String originalString = "Hello world this is Java";
	        String result = reverseWords(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed Words: " + result);
		 
		 
		 
		 
		 
	}

}
