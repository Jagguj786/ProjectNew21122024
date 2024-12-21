
public class ChangeCaseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welCOme woRLD";
		
        char[] ch = s.toCharArray();
        
        for(int i=0;i<s.length();i++) {
        	
        	if(Character.isUpperCase(ch[i])) {
        		
        		ch[i] = Character.toLowerCase(ch[i]);
        		System.out.print(ch[i]);
        		
        	}
        	
        	else if(Character.isLowerCase(ch[i])) {
        		
        		ch[i] = Character.toUpperCase(ch[i]);
        		System.out.print(ch[i]);
        		
        	}
        	
        	else {
        		System.out.print(" ");
        	}
        	
        }
        

		
		
	}

}
