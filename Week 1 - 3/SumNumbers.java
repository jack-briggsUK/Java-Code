import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sumTotal = 0;
        System.out.println("Input a number to sum to:");
        int sumTo = reader.nextInt();
        int i = 1;

        while (i < (sumTo + 1)) {
            sumTotal = sumTotal + i;
            i ++;
        }
        System.out.println(sumTotal);



        reader.close();
    }
}
