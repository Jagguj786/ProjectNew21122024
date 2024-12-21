import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Big black bug bit a big black dog on his big black nose";
		
		s=s.toLowerCase();
		
		String[] str = s.split(" ");
		int l = str.length;
		//System.out.println(l);
		
		Set<String> str2=new HashSet<>();
		
		for(int i=0;i<l;i++) {
			
		str2.add(str[i]);
		
		
		}
		
		System.out.println(str2);
		
		for(String st:str2) {
			int count = 0;
			for(int i=0;i<l;i++) {
				
				
				//st==str[i] won't work here as these are strings
				if(st.equals(str[i])) {
			    //System.out.println(st);
			    count++;
				}
		}
			
		if(count>1)	{
			
			System.out.println(st+" is repeating "+count+" times.");
			
		}
		
	}
	}	

}
