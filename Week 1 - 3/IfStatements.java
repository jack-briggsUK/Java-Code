import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 45;
        System.out.println("Enter a number:");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("The number is positive!");
            if (number > x) {
                System.out.println("And is larger than x: " + x);
            }
        }


        reader.close();
    }
}
