
public class DivideStringtoNparts {
	
	
	public static void divideString() {
		
		String s = "abcdefxyzwehtiyu";
		int l=s.length();
		int d=3;
		
//		String s3=s.substring(1, 3);
//		System.out.println(s3);
//		
//		String s2=s.substring(6);
		//System.out.println(s2);
		
		for(int i=0;i<=d+1;i++) {
			
			int j=3*i;
			int k=3*(i+1);
			String str123=s.substring(j, k);
			System.out.println(str123);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideStringtoNparts.divideString();
	}

}
