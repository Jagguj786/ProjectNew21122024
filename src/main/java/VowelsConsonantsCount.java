
public class VowelsConsonantsCount {
	
	
	public static void vowelConsonntCounting() {
		
		String str="Welcome World";
		
		int l=str.length();
		int n=l-1;
		char[] ch = str.toCharArray();
		
		int Vcount =0;
		int Ccount =0;
		for(int i=0;i<=n;i++) {
			
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
		    
				Vcount++;
			}
			else {
				Ccount++;
			}
			
		}
		
		System.out.println("Total Vowels in a String are "+Vcount);
		System.out.println("Total Consonents in a String are "+Ccount);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelsConsonantsCount.vowelConsonntCounting();
	}

}
