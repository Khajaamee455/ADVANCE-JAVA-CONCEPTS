import java.io.File;

/**
 * Delete
 */
public class Delete {

    public static void main (String args[]){
        File file = new File("create.txt");

        try {
            if(file.delete()){
                System.out.println("file deleted successfully..." +file.getName());
            }
            else{
                System.out.println("file is not found...");
            }
        }finally {
            System.out.println("Hello ....."); 
           
        }
    }
}