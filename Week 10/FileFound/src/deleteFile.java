import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File f = new File("example.txt");

        if (f.delete()) {
            System.out.println("File " + f.getName() + " go bye bye!");
        } else {
            System.out.println("File " + f.getName() + " is like proper locked down!");
        }
    }
}
