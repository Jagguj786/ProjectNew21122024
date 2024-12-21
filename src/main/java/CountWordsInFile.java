import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String line;  
        int count = 0;  
  
        //Opens a file in read mode  
        FileReader file = new FileReader("D:\\data.txt ");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();
        
        String s = " abc eyjd tiy ";
        System.out.println(s.strip());
        
    }  
}  