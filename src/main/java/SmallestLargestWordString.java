import java.util.HashMap;
import java.util.Map;

public class SmallestLargestWordString {
	
	
	//ChatGpt method
	public static void smalestAndLargestWord() {
	
	String input = "Java is a versatile programming language";

    // Split the string into words
    String[] words = input.split(" ");

    // Initialize smallest and largest words
    String smallest = words[0];
    String largest = words[0];

    // Iterate through the words
    for (String word : words) {
        if (word.length() < smallest.length()) {
            smallest = word;
        }
        if (word.length() > largest.length()) {
            largest = word;
        }
    }

    // Print the results
    System.out.println("Smallest Word of Length "+smallest.length()+" is: "+ smallest);
    System.out.println("Largest Word of Length " +largest.length()+" is: "+ largest);
}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		String s="Hardships often prepare ordinary people for an extraordinary destiny";
		Map<String,Integer> map = new HashMap<>();
		
		String[] str = s.split(" ");
		int l = str.length;
		for(int i=0;i<l;i++) {
			
			int l2= str[i].length();
			
			map.put(str[i], l2);
			
			//System.out.println(str[i]+" is of Length "+l2);
			
		}
		
		System.out.println(map);
		
		//ChatGPT Method
		SmallestLargestWordString.smalestAndLargestWord();
		
	}
	
	
	

}
