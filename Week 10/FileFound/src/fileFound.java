import java.io.File;

public class fileFound {
    
    public static void main(String[] args) {
       File f = new File("/Users/jackbriggs/Desktop/file.txt");

    if(!f.exists()) {
            System.out.println("File does not exist");

    } else {
        System.out.println("File found!!");
    }

    }
    
    
    
}
