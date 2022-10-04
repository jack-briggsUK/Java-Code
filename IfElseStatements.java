package Code;

/**
 * IfElseStatements
 */
import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Pick a number:");
        int number = Integer.parseInt(reader.nextLine());
        if (number == 1) {
            System.out.println("The number is one.");
        } else if (number == 2) {
            System.out.println("The number is two.");
        } else if (number == 3) {
            System.out.println("The number is Three!");
        } else {
            System.out.println("Quite a lot!");
        }
    }

}