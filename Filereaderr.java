import java.io.FileReader;
import  java.io.IOException;
public class Filereaderr {
    
    public static void main(String[] args) {
        try {
           FileReader filereader = new FileReader("create.txt");

         int charector;
         while((charector = filereader.read()) != -1){
            System.out.print((char) charector);
         }
         filereader.close();
            
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
