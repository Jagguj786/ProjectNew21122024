
public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcde";
		String s2 = "deabc";
		
		s1=s1.concat(s1);
		System.out.println(s1);
		
		if(s1.contains(s2)) {
			
			System.out.println("It is a String Rotation");
			
		}
		
		else {
			System.out.println("Not a String Rotation");
		}
		
		
	}

}
