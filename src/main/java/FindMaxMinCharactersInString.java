import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMaxMinCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s = "grass is greener on the other side";
		int l=s.length();
		System.out.println(l);
		char[] ch = s.toCharArray();
		
		Set<Character> set= new HashSet<>();
		
		for(int i=0;i<=l-1;i++) {
			
			set.add(ch[i]);
		}
		
		for(Character ch12:set) {
			
			
		int count=0;	
			for(int j=0;j<=s.length()-1;j++) {
				
				if(ch12==ch[j]) {
					
					count++;
					
				}
				
			}
	
			System.out.println(ch12+" repeated "+count+" times.");
			
			Map<Character, Integer> map = new HashMap<>();
		    map.put(ch12, count);
			System.out.println("Map Elements: " + map);
			
			
		}
		
	}
	
 }
