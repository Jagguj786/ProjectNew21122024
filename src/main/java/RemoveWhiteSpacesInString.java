
public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "Hello World Whats Going On";
       
       str.trim();
       
       String s=str.replaceAll(" ", "");
       
       System.out.println(s);
	}

}
