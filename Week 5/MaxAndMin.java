
/**
 * MaxAndMin
 */
import java.util.Random;

public class MaxAndMin {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(10) +1;
            // System.out.println(num[i]);
        }

        int x = 0;
        int y = 10;

        // search array for max number
        for (int i = 0; i < num.length; i++) {

            if (num[i] > x) {
                x = num[i];
            }
        }
        // search array for min number
        for (int i = 0; i < num.length; i++) {

            if (num[i] < y) {
                y = num[i];
            }
        }

        System.out.println("The max number is: " + x + " and the min number is: " + y + ".");

    }

}