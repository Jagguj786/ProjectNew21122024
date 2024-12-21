import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcaaabbccd";
		char[] ch=str.toCharArray();
		
		Set<Character> set = new HashSet<>();
		
		
//		Set<String> fruits = new HashSet<>();
//		List<String> fruits1 = new ArrayList<>();
		
		int l=str.length();
		int n=l-1;
		int count=0;
		
		for(int i=0;i<=n;i++) {
		
			set.add(ch[i]);
				
			}
		
		for(char c:set) {
			
			System.out.println(c);
			count++;
		}
		
		System.out.println("Total number of unique characters in a String are :"+count);
}

}
