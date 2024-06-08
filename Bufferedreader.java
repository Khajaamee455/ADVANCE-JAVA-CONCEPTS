/**
 * Bufferedreader
 */
import  java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Bufferedreader {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("create.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.print(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();

        }
    }
}