
public class ASCIIvalues {

	public static void ASCIIvaluesOf0to127() {
		
		System.out.println("ASCII values from 0 to 127:");

        for (int i = 0; i <= 127; i++) {
            System.out.println("ASCII value " + i + " = '" + (char) i + "'");
        }
	}
	
	
	public static void main(String[] args) {
		//97 to 122
        System.out.println("ASCII values for lowercase letters (a to z):");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println("The ASCII value of '" + ch + "' is: " + (int) ch);
        }
        //65 to 90
        System.out.println("\nASCII values for uppercase letters (A to Z):");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("The ASCII value of '" + ch + "' is: " + (int) ch);
        }
        
        
        ASCIIvalues.ASCIIvaluesOf0to127();
        
        //print ascii value of "a"
        char ch ='a';
        System.out.println((int)ch);
        
        //print ascii value of "b"(Another approach)
        char ch1 ='b';
        int assciivalue = ch1;
        System.out.println(assciivalue);
    }
	
	
}
