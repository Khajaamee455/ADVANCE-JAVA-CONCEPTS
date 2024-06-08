
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {
    
    public static void main(String[] args) {
        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter("create.txt"));
            bw.write("This is comming from buffered writer");
            System.out.println("file wrote sucssfully..");
            bw.close();
        }catch(IOException e){
            System.out.println("error while writing file..");
            e.printStackTrace();
        }
    }
}
