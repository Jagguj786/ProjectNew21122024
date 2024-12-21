
public class NumToAplabetsAndVS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Test786KL786";
		
		char[] ch = str.toCharArray();
		StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			
			
			if(Character.isDigit(ch[i])) {
				
				numbers.append(ch[i]);
				
				
			}
			
			else if(Character.isLetter(ch[i])) {
				
				alphabets.append(ch[i]);
				
				
			}
			
			
		}
		
		System.out.println(numbers);
		System.out.println(alphabets);
		
		
	}

}
