
public class ReverseNumber {

	public static void main(String[] args) {
		
		
        int number = 792831;
        String numberStr = Integer.toString(number);  // Convert integer to string
        int[] digits = new int[numberStr.length()];    // Create int array of required size
        
//        for (int i = 0; i < numberStr.length(); i++) {
//            digits[i] = numberStr.charAt(i) - '0';     // Convert each char to int
//        }
        
        
        for (int i = numberStr.length()-1; i>=0; i--) {
        	//-'0' is needed to convert to int, if u dont add this then Ascii value will print
            digits[i] = numberStr.charAt(i)-'0';     // Convert each char to int
            System.out.print(" "+digits[i]);
        }

        
    }

}
