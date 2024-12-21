import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStringsInAplhaBeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Sort Strings
		String[] str = {"orange", "apple", "banana", "grape"};
		
		//List<String> str = Arrays.asList("Test", "YTr","yerty");
				//new ArrayList<String>();
		
		
		Arrays.sort(str);
		
		for(String s: str) {
		
		System.out.println(s);
		
		}
		
		//Sort char
		char[] cha = {'d', 'e', 'a','b'};
		
		Arrays.sort(cha);
		
		for(char ch: cha) {
			
			System.out.println(ch);
			
			}
		
		//Sort numbers
        int[] in = {476,43,45,1};
		
		Arrays.sort(in);
		
		for(int i: in) {
			
			System.out.println(i);
			
			}
		
		
		 String str1 = "Hello World";

		 String[] words = str1.split(" ");

		 StringBuilder reversed = new StringBuilder();

		 for (int i = words.length-1; i >= 0; i--) {

		 reversed.append(words[i]).append(" ");

		 }

		 System.out.println("Reversed Words: " + reversed.toString().trim());
		
		}
	}


