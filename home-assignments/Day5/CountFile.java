import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class CountFile   
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int countWords = 0;  
        int countSe=0;
        FileReader file = new FileReader("data.txt");  
        BufferedReader br = new BufferedReader(file);  
               
        while((line = br.readLine()) != null) {  
            String words[] = line.split(" ");
            String se[] = line.split(".");    
            countWords = countWords + words.length;
            countSe+=se.length;
        }  
          
        System.out.println("Number of words present in given file: " + countWords);  
        System.out.println("Number of sentences present in given file: " + countSe);
        br.close();  
    }  
}  