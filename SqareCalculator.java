package Code;
/**
 * QuickStart
 */
import java.util.Scanner;

public class SqareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Integer.parseInt(reader.nextLine());

        System.out.println("Enter height: ");
        double height = Integer.parseInt(reader.nextLine());

        
        double perimiter = 2 * (width + height);
        double sqArea = (width * height);

        System.out.println("the width is: "+ width);
        System.out.println("The length is: "+ height);

        System.out.println("The perimiter is: " + perimiter);
        System.out.println("The area is: " + sqArea);

        double radius = 12.0;
        double circleArea = Math.round((Math.PI * Math.pow(2, radius)));

        System.out.println(circleArea);
    }
}