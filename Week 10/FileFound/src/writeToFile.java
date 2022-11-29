import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("example.txt");

            myWriter.write("Files in Java might be tricky, but it is fun though");

            myWriter.close();

            System.out.println("Sucess!!");

        } catch (IOException e) {
            // TODO: handle exception

            System.out.println("An error occurred!");

        }
    }
}
