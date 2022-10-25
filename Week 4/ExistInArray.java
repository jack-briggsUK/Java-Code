import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        boolean found = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number to search for: ");
        int search = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
            }
        };
        

        if (found == true) {
            System.out.println("Value " + search + " found in array");
        } else {
            System.out.println("Value " + search + " was not found in array");
        }

    }
}
