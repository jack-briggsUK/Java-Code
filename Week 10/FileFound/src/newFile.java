import java.io.File;
import java.io.IOException;

public class newFile {
 
    public static void main(String[] args) {
        try {
            File f = new File("/Users/jackbriggs/Desktop/file2.txt");

            if (f.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File could not be created");
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occorred!");
        }

    }
}
