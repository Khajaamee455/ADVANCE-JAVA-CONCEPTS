import java.io.File;
import java.io.IOException;

class Createfile{

    public static void main(String[] args) {

        File file = new File("Delete.java");  // i have create delete.java file lets see how to delete this..

        try {
            if(file.createNewFile()){
                System.out.println("file created successfully...");
            }
            else{
                System.out.println("fiel exists ....");
            }
        } catch (IOException e) {
            System.out.println("Error occured while creating a file ");
            e.printStackTrace();
        }
    }
}