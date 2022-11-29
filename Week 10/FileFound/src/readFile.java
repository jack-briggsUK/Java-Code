import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        try {
            File f = new File("example.txt");
            Scanner myReader = new Scanner(f);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("An error occurred.");
        }
    }
}
