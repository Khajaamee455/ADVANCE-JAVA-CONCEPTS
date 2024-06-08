import java.io.FileWriter;
import java.io.IOException;

class Filewriter{

    public static void main(String args []){

        try{

            FileWriter filewriter = new FileWriter("create.txt");
          filewriter.write("This is comming from filewriter");
          filewriter.close();
            System.out.println("file wrote succussfully..");
         
         


        }catch(IOException e){
            System.out.println("error...");
           

        }
    }
}