import java.util.Scanner;

public class OccuranceOfCharInString {
	
	
	public static void findCharOccurance(String str) {
		
		int l=str.length();
		int n=l-1;
		
		char[] ch = str.toCharArray();
//		
//		System.out.println(ch);
//		
//		for(char c:ch) {
//			System.out.println(c);
//		}
		
		char c = 't';
		int count = 0;
		for(int i=0;i<=n;i++) {
			
			if(c==ch[i]) {
			
			count++;
			}
		}
		
		System.out.println("The Character "+c+" is occuring "+count+" times");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		OccuranceOfCharInString.findCharOccurance("test project");
		
		
	}

}
