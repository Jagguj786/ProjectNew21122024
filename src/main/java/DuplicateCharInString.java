import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "programming";

		 Map<Character, Integer> charCountMap = new HashMap<>();

		 for (char ch : str.toCharArray()) {

		 if (charCountMap.containsKey(ch)) {

		 charCountMap.put(ch, charCountMap.get(ch) + 1);

		 } else {

		 charCountMap.put(ch, 1);

		 }

		 }

		 System.out.println("Duplicate Characters:");

		 for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

		 if (entry.getValue() > 1) {

		 System.out.println(entry.getKey() + " – " + entry.getValue() + " times");

		 }

		 }
	}

}
